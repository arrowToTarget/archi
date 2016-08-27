package com.lewis.archi.controller;

import com.lewis.archi.common.util.pageUtil.Page;
import com.lewis.archi.service.ICustomerService;
import com.lewis.archi.vo.CustomerModel;
import com.lewis.archi.vo.CustomerQueryModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhangminghua on 2016/8/27.
 */
@Controller
@RequestMapping("/cust")
public class CustomerController {

    @Resource
    private ICustomerService customerService;


    @RequestMapping(value = "/get")
    @ResponseBody()
    public String createAndQueryCustomer(){
        CustomerModel cm = new CustomerModel();
        cm.setUuid(1);
        cm.setCustomerId("cust_1");
        cm.setPwd("password1");
        cm.setShowName("张三");
        cm.setTrueName("李四");
        cm.setRegisterTime("2016-08-27 10:10:10");
        customerService.create(cm);
        Page<CustomerModel> byConditionPage = customerService.getByConditionPage(new CustomerQueryModel());
        System.out.println(byConditionPage.toString());
        return byConditionPage.toString();
    }

}
