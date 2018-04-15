package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;
import com.itplayer.core.base.enums.DeviceType;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_device")
public class Device extends MetaEntity {
    /**
     * 设备名称
     */
    private String deviceName;
    /**
     * 设备型号
     */
    private String deviceModel;
    /**
     * 设备机架号
     */
    private String deviceFrame;

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
}
