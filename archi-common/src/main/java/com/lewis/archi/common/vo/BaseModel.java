package com.lewis.archi.common.vo;

import com.lewis.archi.common.util.pageUtil.Page;

/**
 * Created by zhangminghua on 2016/8/27.
 */
public class BaseModel {

    private Integer uuid;

    private Page page = new Page();

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseModel)) return false;

        BaseModel baseModel = (BaseModel) o;

        return uuid != null ? uuid.equals(baseModel.uuid) : baseModel.uuid == null;

    }

    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }


}
