package com.itplayer.core.system.repository;

import com.itplayer.core.base.repo.BaseRepository;
import com.itplayer.core.system.entity.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends BaseRepository<Permission, Long> {
}
