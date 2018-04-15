package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.DeviceInfo;
import com.itplayer.core.device.repository.DeviceInfoRepository;
import com.itplayer.core.device.service.DeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeviceInfoServiceImpl extends BaseServiceImpl<DeviceInfo, Long> implements DeviceInfoService {

    DeviceInfoRepository deviceInfoRepository;

    @Autowired
    public void setDeviceInfoRepository(DeviceInfoRepository deviceInfoRepository) {
        super.setRepostory(deviceInfoRepository);
        this.deviceInfoRepository = deviceInfoRepository;
    }
}
