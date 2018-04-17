package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.BbuDeviceInfo;
import org.springframework.data.domain.ExampleMatcher;

/**
 * Created by caijun.yang on 2018/4/17
 */
public class BbuDeviceInfoQueryModel extends QueryModel<BbuDeviceInfo> {

    private BbuDeviceInfo bbuDeviceInfo;

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        if (bbuDeviceInfo.getDeviceId() != null) {
            exampleMatcher.withMatcher("deviceId", ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        }
        return exampleMatcher;
    }

    public BbuDeviceInfo getBbuDeviceInfo() {
        return bbuDeviceInfo;
    }

    public void setBbuDeviceInfo(BbuDeviceInfo bbuDeviceInfo) {
        this.bbuDeviceInfo = bbuDeviceInfo;
    }
}
