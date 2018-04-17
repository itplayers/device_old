package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.OrdinaryInfo;
import com.itplayer.core.device.repository.OrdinaryInfoRepository;
import com.itplayer.core.device.service.OrdinaryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdinaryInfoServiceImpl extends BaseServiceImpl<OrdinaryInfo, Long> implements OrdinaryInfoService {

    OrdinaryInfoRepository ordinaryInfoRepository;

    @Autowired
    public void setOrdinaryInfoRepository(OrdinaryInfoRepository ordinaryInfoRepository) {
        super.setRepostory(ordinaryInfoRepository);
        this.ordinaryInfoRepository = ordinaryInfoRepository;
    }
}
