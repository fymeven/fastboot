package com.fastboot.bean.base;

import java.io.Serializable;

public class PageModel implements Serializable{
    private Integer pageNo; //页码
    private Integer pageSize;// 数据行数
    private String orderByClause; //排序规则

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
}
