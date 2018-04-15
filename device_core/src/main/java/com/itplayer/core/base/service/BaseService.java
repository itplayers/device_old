package com.itplayer.core.base.service;

import com.itplayer.core.base.entity.BaseEntity;
import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.page.PageResult;
import org.springframework.data.domain.ExampleMatcher;

import java.io.Serializable;
import java.util.List;

/**
 * Created by caijun.yang on 2018/4/11
 */
public interface BaseService<T extends BaseEntity, PK extends Serializable> {


    void create(T t);

    void update(T t);

    void deleteByPrimaryKey(PK id);

    T getByPrimaryKey(Long id);

    void deleteByEntity(T t);

    PageResult<T> queryPage(QueryModel<T> queryModel);

    void batchDelete(PK[] ids);

    List<T> findAll();
}
