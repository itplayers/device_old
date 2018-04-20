package com.itplayer.core.base.service.impl;

import com.itplayer.core.base.entity.BaseEntity;
import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.page.PageableUtil;
import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.repo.BaseRepository;
import com.itplayer.core.base.service.BaseService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<T extends BaseEntity, PK extends Serializable> implements BaseService<T, PK> {

    BaseRepository repostory;

    public void setRepostory(BaseRepository repostory) {
        this.repostory = repostory;
    }


    @Override
    public void create(T t) {
        repostory.save(t);
    }

    @Override
    public void update(T t) {
        repostory.save(t);
    }

    @Override
    public void deleteByPrimaryKey(PK id) {
        repostory.delete(id);
    }

    @Override
    public T getByPrimaryKey(Long id) {
        return (T) repostory.getOne(id);
    }

    @Override
    public void deleteByEntity(T t) {
        repostory.delete(t);
    }

    @Override
    public PageResult<T> queryPage(QueryModel<T> queryModel) {
//        Example<T> example = queryModel.buildExample();
//        Pageable pageable = queryModel.buildPageable();
//        Page<T> tPage = repostory.findAll(example, pageable);
//        long totalCount = repostory.count(example);
//        queryModel.setTotalCount(totalCount);
//        List<T> content = tPage.getContent();
//        return new PageResult(content, queryModel);

        Specification<T> specification = queryModel.buildSpecification();
        Pageable pageable = queryModel.buildPageable();
        long totalCount = repostory.count(specification);
        Page<T> tPage = repostory.findAll(specification, pageable);
        queryModel.setTotalCount(totalCount);
        List<T> content = tPage.getContent();
        return new PageResult(content, queryModel);
    }

    @Override
    public void batchDelete(PK[] ids) {

    }

    @Override
    public List<T> findAll() {
        List<T> areas = repostory.findAll();
        return areas;
    }
}
