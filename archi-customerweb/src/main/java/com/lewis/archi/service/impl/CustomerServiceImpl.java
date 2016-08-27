package com.lewis.archi.service.impl;

import com.lewis.archi.common.service.impl.BaseServiceImpl;
import com.lewis.archi.dao.ICustomerDAOI;
import com.lewis.archi.service.ICustomerService;
import com.lewis.archi.vo.CustomerModel;
import com.lewis.archi.vo.CustomerQueryModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangminghua on 2016/8/27.
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerModel,CustomerQueryModel> implements ICustomerService {

    @Resource
    private ICustomerDAOI customerDAO;

    @Resource
    public void setCustomerDAO(ICustomerDAOI customerDAO) {
        this.customerDAO = customerDAO;
        super.setBaseDAO(customerDAO);
    }

    public CustomerModel getByCustomerId(String customerId) {
        return customerDAO.getByCustomerId(customerId);
    }

}
