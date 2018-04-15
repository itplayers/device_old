package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_deviceInfo")
public class DeviceInfo extends MetaEntity {

    /**
     * 设备编号
     */
    private Long deviceId;
    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 端口
     */
    private String port;
    /**
     * 割接后端口
     */
    private String portAfterCutover;
    /**
     * 光电转换器
     */
    private String photoelectricConverter;
    /**
     * 跳纤架框槽端子（ODF B面）
     */
    private String fiberFrame;

    /**
     * 对端设备名称
     */
    private String targetName;
    /**
     * 对端设备机架
     */
    private String targetFrame;
    /**
     * 对端业务端口
     */
    private String oppositePort;

    /**
     * 纤芯占用
     */
    private String opticalCore;
    /**
     * 接入号
     */
    private String accessNo;
    /**
     *
     */
    private String opticalName;
    /**
     * 描述
     */
    private String contentDesc;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPortAfterCutover() {
        return portAfterCutover;
    }

    public void setPortAfterCutover(String portAfterCutover) {
        this.portAfterCutover = portAfterCutover;
    }

    public String getPhotoelectricConverter() {
        return photoelectricConverter;
    }

    public void setPhotoelectricConverter(String photoelectricConverter) {
        this.photoelectricConverter = photoelectricConverter;
    }

    public String getFiberFrame() {
        return fiberFrame;
    }

    public void setFiberFrame(String fiberFrame) {
        this.fiberFrame = fiberFrame;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetFrame() {
        return targetFrame;
    }

    public void setTargetFrame(String targetFrame) {
        this.targetFrame = targetFrame;
    }

    public String getOppositePort() {
        return oppositePort;
    }

    public void setOppositePort(String oppositePort) {
        this.oppositePort = oppositePort;
    }

    public String getOpticalCore() {
        return opticalCore;
    }

    public void setOpticalCore(String opticalCore) {
        this.opticalCore = opticalCore;
    }

    public String getAccessNo() {
        return accessNo;
    }

    public void setAccessNo(String accessNo) {
        this.accessNo = accessNo;
    }

    public String getOpticalName() {
        return opticalName;
    }

    public void setOpticalName(String opticalName) {
        this.opticalName = opticalName;
    }

    public String getContentDesc() {
        return contentDesc;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }
}
