package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.OrdinaryInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class OrdinaryInfoQueryModel extends QueryModel<OrdinaryInfo> {
    private OrdinaryInfo ordinaryInfo;

    @Override
    public Example<OrdinaryInfo> buildExample() {
        return super.buildExample();
    }

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        if (ordinaryInfo.getDeviceId() != null) {
            exampleMatcher.withMatcher("deviceId", ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        }
        return exampleMatcher;
    }

    public OrdinaryInfo getOrdinaryInfo() {
        return ordinaryInfo;
    }

    public void setOrdinaryInfo(OrdinaryInfo ordinaryInfo) {
        this.ordinaryInfo = ordinaryInfo;
    }
}
