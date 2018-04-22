package com.itplayer.core.system.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.system.entity.Area;
import com.itplayer.core.system.repository.AreaRepository;
import com.itplayer.core.system.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
