package com.itplayer.core.device.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.device.entity.EngineRoom;
import com.itplayer.core.device.repository.EngineRoomRepository;
import com.itplayer.core.device.service.EngineRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EngineRoomServiceImpl extends BaseServiceImpl<EngineRoom, Long> implements EngineRoomService {
    EngineRoomRepository engineRoomRepository;

    @Autowired
    public void setEngineRoomRepository(EngineRoomRepository engineRoomRepository) {
        super.setRepostory(engineRoomRepository);
        this.engineRoomRepository = engineRoomRepository;

    }

}
