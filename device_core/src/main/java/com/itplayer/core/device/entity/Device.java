package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;
import com.itplayer.core.base.enums.DeviceType;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_device")
public class Device extends MetaEntity {
    /**
     * 机房id
     */
    private Long engineRoomId;
    /**
     * 本端设备名称
     */
    private String deviceName;
    /**
     * 本端设备型号
     */
    private String deviceModel;
    /**
     * 本端所在机架
     */
    private String deviceFrame;

    /**
     * SN码， ipran独有
     */
    private String snCode;

    private DeviceType deviceType;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceFrame() {
        return deviceFrame;
    }

    public void setDeviceFrame(String deviceFrame) {
        this.deviceFrame = deviceFrame;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getSnCode() {
        return snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode;
    }

    public Long getEngineRoomId() {
        return engineRoomId;
    }

    public void setEngineRoomId(Long engineRoomId) {
        this.engineRoomId = engineRoomId;
    }
}
