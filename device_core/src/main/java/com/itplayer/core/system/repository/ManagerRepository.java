package com.itplayer.core.system.repository;

import com.itplayer.core.base.repo.BaseRepository;
import com.itplayer.core.system.entity.Manager;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends BaseRepository<Manager, Long> {
}
