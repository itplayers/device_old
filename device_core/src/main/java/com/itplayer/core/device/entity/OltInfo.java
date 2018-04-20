package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by caijun.yang on 2018/4/16
 * 上网传输设备
 */
@Entity
@Table(name = "tbl_oltInfo")
public class OltInfo extends MetaEntity {

    private Long deviceId;
    /**
     * 槽位/槽口/端口
     */
    private String port;
    /**
     * 业务标签
     */
    private String serviceName;

    /**
     * 对应跳纤架（ODF）
     */
    private String fiberFrameAddr;
    /**
     * 跳纤架框槽端子（ODFB面）
     */
    private String fiberFramePort;
    /**
     * 出局ODF架/对端设备
     */
    private String targetDevice;
    /**
     * 物理端口 ODF架框槽端子/对端设备端口
     */
    private String physicalPort;
    /**
     * 光缆名称
     */
    private String opticalName;
    /**
     * 纤芯占用
     */
    private String opticalCore;
    /**
     * 标签/人工
     */
    private String lable;

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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public String getPhysicalPort() {
        return physicalPort;
    }

    public void setPhysicalPort(String physicalPort) {
        this.physicalPort = physicalPort;
    }

    public String getOpticalName() {
        return opticalName;
    }

    public void setOpticalName(String opticalName) {
        this.opticalName = opticalName;
    }

    public String getOpticalCore() {
        return opticalCore;
    }

    public void setOpticalCore(String opticalCore) {
        this.opticalCore = opticalCore;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
