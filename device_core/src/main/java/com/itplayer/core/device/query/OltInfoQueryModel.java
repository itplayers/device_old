package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.OltInfo;
import org.springframework.data.domain.ExampleMatcher;

/**
 * Created by caijun.yang on 2018/4/17
 */
public class OltInfoQueryModel extends QueryModel<OltInfo> {
    private OltInfo oltInfo;

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        if (oltInfo.getDeviceId() != null) {
            exampleMatcher.withMatcher("deviceId", ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        }
        return exampleMatcher;
    }

    public OltInfo getOltInfo() {
        return oltInfo;
    }

    public void setOltInfo(OltInfo oltInfo) {
        this.oltInfo = oltInfo;
    }
}
