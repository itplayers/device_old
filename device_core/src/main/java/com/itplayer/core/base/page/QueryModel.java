package com.itplayer.core.base.page;

import com.itplayer.core.base.entity.BaseEntity;
import com.itplayer.core.base.utils.JsonUtils;
import com.itplayer.core.base.utils.StrUtils;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

/**
 * Created by caijun.yang 2018-4-15.
 */
public  class QueryModel<T extends BaseEntity> implements Model {
    private Long totalCount;
    private Long totalPage;
    private Integer currentPage;
    private Integer pageSize;
    private String order;


    /**
     * 初始化page的JSON串为对象
     *
     * @param page
     * @return
     */
    public static QueryModel init(String page) {
        if (StrUtils.isNull(page)) {
            return null;
        }
        try {
            return JsonUtils.str2Obj(page, QueryModel.class);
        } catch (Exception e) {
            return null;
        }
    }

    public static Integer calcStartLine(Integer currentPage, Integer pageSize) {
        return (currentPage - 1) * pageSize;
    }

    public void setTotalCount(Long collectionSize) {
        this.totalCount = collectionSize;
        this.totalPage = collectionSize < pageSize ? 1 : collectionSize / pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage < 1 ? 1 : currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withIgnoreNullValues().withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.DEFAULT);
        return exampleMatcher;
    }

    public Example<T> buildExample() {
        return null;
    }
}
