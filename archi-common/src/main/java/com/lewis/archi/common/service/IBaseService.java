package com.lewis.archi.common.service;


import com.lewis.archi.common.vo.BaseModel;
import com.lewis.archi.common.util.pageUtil.Page;

/**
 * Created by zhangminghua on 2016/8/27.
 */
public interface IBaseService<M,QM extends BaseModel> {

    public void create(M m);

    public void update(M m);

    public void delete(Integer uuid);

    public M getByUuid(Integer uuid);

    public Page<M> getByConditionPage(QM qm);
}
