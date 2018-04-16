package com.itplayer.core.device.entity;

import com.itplayer.core.base.entity.MetaEntity;

/**
 * Created by caijun.yang on 2018/4/16
 * 上网传输设备
 */
public class OltInfo extends MetaEntity {


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
    
}
