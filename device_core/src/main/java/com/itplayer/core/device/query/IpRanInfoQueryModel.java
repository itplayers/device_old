package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.BbuDeviceInfo;
import com.itplayer.core.device.entity.IpRanInfo;
import org.springframework.data.domain.ExampleMatcher;

/**
 * Created by caijun.yang on 2018/4/17
 */
public class IpRanInfoQueryModel extends QueryModel<IpRanInfo> {

    private IpRanInfo ipRanInfo;

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        if (ipRanInfo.getDeviceId() != null) {
            exampleMatcher.withMatcher("deviceId", ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        }
        return exampleMatcher;
    }

    public IpRanInfo getIpRanInfo() {
        return ipRanInfo;
    }

    public void setIpRanInfo(IpRanInfo ipRanInfo) {
        this.ipRanInfo = ipRanInfo;
    }
}
