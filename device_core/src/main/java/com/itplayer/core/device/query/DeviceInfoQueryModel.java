package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.OrdinaryInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class DeviceInfoQueryModel extends QueryModel<OrdinaryInfo> {
    private OrdinaryInfo ordinaryInfo;

    @Override
    public Example<OrdinaryInfo> buildExample() {
        return super.buildExample();
    }

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        boolean allIsNull = true;
        if (ordinaryInfo.getDeviceId() != null) {
            allIsNull = false;
            exampleMatcher.withMatcher("deviceId", ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        }
        if (allIsNull) {
            return super.buildMatcher();
        }
        return exampleMatcher;
    }
}
