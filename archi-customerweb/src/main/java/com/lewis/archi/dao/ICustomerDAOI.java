package com.lewis.archi.dao;

import com.lewis.archi.common.dao.IBaseDAO;
import com.lewis.archi.vo.CustomerModel;
import com.lewis.archi.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangminghua on 2016/8/27.
 */
@Repository
public interface ICustomerDAOI extends IBaseDAO<CustomerModel,CustomerQueryModel> {

    CustomerModel getByCustomerId(String customerId);

}
