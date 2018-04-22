package com.itplayer.core.system.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.system.entity.Role;
import com.itplayer.core.system.repository.RoleRepository;
import com.itplayer.core.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Long> implements RoleService {

    RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
        super.setRepostory(roleRepository);
    }
}
