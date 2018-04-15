package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.device.entity.EngineRoom;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class EngineRoomQueryModel extends QueryModel<EngineRoom> {

    private EngineRoom engineRoom;

    @Override
    public Example<EngineRoom> buildExample() {
        return super.buildExample();
    }

    @Override
    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        boolean allIsNull = true;
        if (StrUtils.isNotNull(engineRoom.getDeviceRoomName())) {
            allIsNull = false;
            exampleMatcher.withMatcher("roomName", ExampleMatcher.GenericPropertyMatchers.contains());
        }
        if (allIsNull) {
            return super.buildMatcher();
        }
        return exampleMatcher;
    }
}
