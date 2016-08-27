package com.lewis.archi.common.dao;

import java.util.List;

/**
 * Created by zhangminghua on 2016/8/27.
 */
public interface IBaseDAO<M, QM> {

    void create(M m);

    void update(M m);

    void delete(Integer uuid);

    M getByUUid(Integer uuid);

    List<M> getByConditionPage(QM qm);
}
