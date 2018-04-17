package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.OltInfo;
import com.itplayer.core.device.repository.OltInfoRepository;
import com.itplayer.core.device.service.OltInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caijun.yang on 2018/4/17
 */
@Service
public class OltInfoServiceImpl extends BaseServiceImpl<OltInfo, Long> implements OltInfoService {

    OltInfoRepository oltInfoRepository;

    @Autowired
    public void setOltInfoRepository(OltInfoRepository oltInfoRepository) {
        this.oltInfoRepository = oltInfoRepository;
        super.setRepostory(oltInfoRepository);
    }
}
