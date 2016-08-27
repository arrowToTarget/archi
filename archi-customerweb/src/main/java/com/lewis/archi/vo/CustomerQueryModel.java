package com.lewis.archi.vo;

import com.lewis.archi.common.util.pageUtil.Page;

/**
 * Created by zhangminghua on 2016/8/27.
 */
public class CustomerQueryModel extends CustomerModel {
    private Page page = new Page();

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
