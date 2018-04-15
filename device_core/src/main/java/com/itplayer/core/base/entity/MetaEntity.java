package com.itplayer.core.base.entity;

import javax.persistence.*;

/**
 * Created by caijun.yang on 2018/4/11
 */
@MappedSuperclass
public class MetaEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
