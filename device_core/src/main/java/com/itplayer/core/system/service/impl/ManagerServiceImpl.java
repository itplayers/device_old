package com.itplayer.core.system.service.impl;

import com.itplayer.core.base.service.impl.BaseServiceImpl;
import com.itplayer.core.system.entity.Manager;
import com.itplayer.core.system.repository.ManagerRepository;
import com.itplayer.core.system.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl extends BaseServiceImpl<Manager, Long> implements ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    public void setManagerRepository(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
        super.setRepostory(managerRepository);
    }
}
