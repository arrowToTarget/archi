package com.lewis.archi.service;

import com.lewis.archi.common.service.IBaseService;
import com.lewis.archi.vo.CustomerModel;
import com.lewis.archi.vo.CustomerQueryModel;

/**
 * Created by zhangminghua on 2016/8/27.
 */
public interface ICustomerService extends IBaseService<CustomerModel,CustomerQueryModel> {



    CustomerModel getByCustomerId(String customerId);
}
