package com.kgc.utils;

/**
 * @Author:LiuHao
 * @Date:2020/5/10 14:32
 */
public class PageParmeter {
    private Integer page=1;//页码
    private Integer pageSize=3;//页大小

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
