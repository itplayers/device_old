package com.itplayer.core.system.entity;

import com.itplayer.core.base.entity.MetaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by caijun.yang on 2018/4/11
 */
@Entity
@Table(name = "tbl_area")
public class Area extends MetaEntity {

    @Column(name = "areacode")
    private String areaCode;
    @Column(name = "areaname")
    private String areaName;
    @Column
    private Long parent_id;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }


}
