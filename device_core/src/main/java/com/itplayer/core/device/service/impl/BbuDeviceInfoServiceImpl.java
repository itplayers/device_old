package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.BbuDeviceInfo;
import com.itplayer.core.device.repository.BbuDeviceInfoRepository;
import com.itplayer.core.device.service.BbuDeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caijun.yang on 2018/4/17
 */
@Service
public class BbuDeviceInfoServiceImpl extends BaseServiceImpl<BbuDeviceInfo, Long> implements BbuDeviceInfoService {

    BbuDeviceInfoRepository bbuDeviceInfoRepository;

    @Autowired
    public void setBbuDeviceInfoRepository(BbuDeviceInfoRepository bbuDeviceInfoRepository) {
        this.bbuDeviceInfoRepository = bbuDeviceInfoRepository;
        super.setRepostory(bbuDeviceInfoRepository);
    }
}
