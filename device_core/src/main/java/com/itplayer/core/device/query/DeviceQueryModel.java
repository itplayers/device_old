package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.device.entity.Device;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class DeviceQueryModel extends QueryModel<Device> {

    private Device device;

    @Override
    public Example<Device> buildExample() {
        return super.buildExample();
    }

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        boolean allIsNull = true;
        if (StrUtils.isNotNull(device.getDeviceName())) {
            allIsNull = false;
            exampleMatcher.withMatcher("deviceName", ExampleMatcher.GenericPropertyMatchers.contains());
        }
        if (allIsNull) {
            return super.buildMatcher();
        }
        return exampleMatcher;
    }
}
