package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.IpRanInfo;
import com.itplayer.core.device.repository.IpRanInfoRepository;
import com.itplayer.core.device.service.IpRanInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caijun.yang on 2018/4/17
 */
@Service
public class IpRanInfoServiceImpl extends BaseServiceImpl<IpRanInfo, Long> implements IpRanInfoService {

    IpRanInfoRepository ipRanInfoRepository;

    @Autowired
    public void setIpRanInfoRepository(IpRanInfoRepository ipRanInfoRepository) {
        this.ipRanInfoRepository = ipRanInfoRepository;
        super.setRepostory(ipRanInfoRepository);
    }
}
