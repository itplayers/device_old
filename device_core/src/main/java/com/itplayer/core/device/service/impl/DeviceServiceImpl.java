package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.Device;
import com.itplayer.core.device.repository.DeviceRepository;
import com.itplayer.core.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl extends BaseServiceImpl<Device, Long> implements DeviceService {

    private DeviceRepository deviceRepository;

    @Autowired
    public void setDeviceRepository(DeviceRepository deviceRepository) {
        super.setRepostory(deviceRepository);
        this.deviceRepository = deviceRepository;
    }
}
