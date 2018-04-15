package com.itplayer.core.base.page;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by caijun.yang 2018-4-15.
 */
public class PageResult<T> {
    @JsonProperty(value = "data")
    public List<T> data;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty(value = "page")
    public QueryModel queryModel;

    public PageResult(List<T> data, QueryModel queryModel) {
        this.data = data;
        this.queryModel = queryModel;
    }
}
