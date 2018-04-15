package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.DeviceInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class DeviceInfoQueryModel extends QueryModel<DeviceInfo> {
    private DeviceInfo deviceInfo;

    @Override
    public Example<DeviceInfo> buildExample() {
        return super.buildExample();
    }

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        boolean allIsNull = true;
        if (deviceInfo.getDeviceId() != null) {
            allIsNull = false;
            exampleMatcher.withMatcher("deviceId", ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        }
        if (allIsNull) {
            return super.buildMatcher();
        }
        return exampleMatcher;
    }
}
