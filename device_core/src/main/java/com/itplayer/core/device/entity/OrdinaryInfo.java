package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_deviceInfo")
public class OrdinaryInfo extends MetaEntity {

    /**
     * 设备编号
     */
    private Long deviceId;
    /**
     * 端口
     */
    private String port;
    /**
     * 跳纤架位置
     */
    private String fiberFrameAddr;

    /**
     * 跳纤架子端口
     */
    private String fiberFramePort;
    /**
     * 对端设备
     */
    private String targetDevice;
    /**
     * 对端设备型号
     */
    private String targetDeviceModel;
    /**
     * 对端设备架框
     */
    private String targetFiberFrame;

    /**
     * 对端设备物理端口
     */
    private String physicalPort;

    /**
     * 业务名称
     */
    private String serviceName;


    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getFiberFrameAddr() {
        return fiberFrameAddr;
    }

    public void setFiberFrameAddr(String fiberFrameAddr) {
        this.fiberFrameAddr = fiberFrameAddr;
    }

    public String getFiberFramePort() {
        return fiberFramePort;
    }

    public void setFiberFramePort(String fiberFramePort) {
        this.fiberFramePort = fiberFramePort;
    }

    public String getTargetDevice() {
        return targetDevice;
    }

    public void setTargetDevice(String targetDevice) {
        this.targetDevice = targetDevice;
    }

    public String getTargetDeviceModel() {
        return targetDeviceModel;
    }

    public void setTargetDeviceModel(String targetDeviceModel) {
        this.targetDeviceModel = targetDeviceModel;
    }

    public String getTargetFiberFrame() {
        return targetFiberFrame;
    }

    public void setTargetFiberFrame(String targetFiberFrame) {
        this.targetFiberFrame = targetFiberFrame;
    }

    public String getPhysicalPort() {
        return physicalPort;
    }

    public void setPhysicalPort(String physicalPort) {
        this.physicalPort = physicalPort;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
