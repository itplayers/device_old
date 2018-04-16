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
}
