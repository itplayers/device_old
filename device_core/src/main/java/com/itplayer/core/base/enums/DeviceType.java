package com.itplayer.core.base.enums;

public enum DeviceType {
    OLT("OLT 光线路终端"),
    MSTP("MSTP"),
    BBU("BBU 室内基带处理单元"),
    SWITCHBOARD("路由器");
    private String name;

    DeviceType(String name) {
        this.name = name;
    }
}
