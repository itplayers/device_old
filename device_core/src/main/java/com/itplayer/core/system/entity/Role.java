package com.itplayer.core.system.entity;

import com.itplayer.core.base.entity.MetaEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sys_role")
public class Role extends MetaEntity {
    @Column
    private String roleCode;
    @Column
    private String roleName;

    // 用户 - 角色关系定义;
    @ManyToMany
    @JoinTable(name = "sys_manager_role", joinColumns = {@JoinColumn(name = "roleId")},
            inverseJoinColumns = {@JoinColumn(name = "managerId")})
    private List<Manager> managers;// 一个角色对应多个用户

    //角色 -- 权限关系：多对多关系;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sys_role_permission", joinColumns = {@JoinColumn(name = "roleId")}, inverseJoinColumns = {@JoinColumn(name = "permissionId")})
    private List<Permission> permissions;


    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
