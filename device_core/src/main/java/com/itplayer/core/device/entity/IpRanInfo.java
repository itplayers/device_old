package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;

/**
 * Created by caijun.yang on 2018/4/16
 * 4G传输设备
 */
public class IpRanInfo extends MetaEntity {
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
     * 物理端口
     */
    private String physicalPort;

    /**
     * 业务名称
     */
    private String serviceName;


}
