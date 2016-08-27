package com.lewis.archi.common.service.impl;

import com.lewis.archi.common.dao.IBaseDAO;
import com.lewis.archi.common.service.IBaseService;
import com.lewis.archi.common.vo.BaseModel;
import com.lewis.archi.common.util.pageUtil.Page;
import java.util.List;

/**
 * Created by zhangminghua on 2016/8/27.
 */

public class BaseServiceImpl<M,QM extends BaseModel> implements IBaseService<M,QM> {

    private IBaseDAO baseDAO;

    public void setBaseDAO(IBaseDAO baseDAO) {
        this.baseDAO = baseDAO;
    }

    public void create(M m) {
        this.baseDAO.create(m);
    }

    public void update(M m) {
        this.baseDAO.update(m);
    }

    public void delete(Integer uuid) {
        this.baseDAO.delete(uuid);
    }

    public M getByUuid(Integer uuid) {
        return (M)this.baseDAO.getByUUid(uuid);
    }

    public Page<M> getByConditionPage(QM qm) {
        List<M> list = this.baseDAO.getByConditionPage(qm);
        qm.getPage().setResult(list);
        return qm.getPage();
    }
}
