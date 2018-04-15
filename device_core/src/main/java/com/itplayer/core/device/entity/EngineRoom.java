package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_deviceRoom")
public class EngineRoom extends MetaEntity {


    private String deviceRoomName;

    private String roomDesc;

    private Long areaId;

    public String getDeviceRoomName() {
        return deviceRoomName;
    }

    public void setDeviceRoomName(String deviceRoomName) {
        this.deviceRoomName = deviceRoomName;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
}

