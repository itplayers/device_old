package com.itplayer.core.system.repository;

import com.itplayer.core.base.repo.BaseRepository;
import com.itplayer.core.system.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends BaseRepository<Role, Long> {
}
