package com.itplayer.core.system.service.impl;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.page.PageableUtil;
import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.system.entity.Area;
import com.itplayer.core.system.repository.AreaRepository;
import com.itplayer.core.system.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caijun.yang on 2018/4/11
 */
@Service
public class AreaServiceImpl extends BaseServiceImpl<Area, Long> implements AreaService {

    AreaRepository areaRepository;

    @Autowired
    public void setAreaRepository(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
        super.setRepostory(areaRepository);
    }

    @Override
    public PageResult<Area> queryPage(QueryModel<Area> queryModel) {
        Example<Area> example = queryModel.buildExample();
        Pageable pageable = PageableUtil.build(queryModel);
        Specification<Area> areaSpecification = queryModel.buildSpecification();
        Page<Area> tPage = areaRepository.findAll(areaSpecification, pageable);
        long totalCount = areaRepository.count(example);
        queryModel.setTotalCount(totalCount);
        List<Area> content = tPage.getContent();
        return new PageResult(content, queryModel);
    }
}
