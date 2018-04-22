package com.itplayer.core.system.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.system.entity.Permission;
import com.itplayer.core.system.repository.PermissionRepository;
import com.itplayer.core.system.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission, Long> implements PermissionService {

    PermissionRepository permissionRepository;

    @Autowired
    public void setPermissionRepository(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
        super.setRepostory(permissionRepository);
    }
}
