package com.itplayer.core.device.repository;

import com.itplayer.core.base.repo.BaseRepository;
import com.itplayer.core.device.entity.OrdinaryInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceInfoRepository extends BaseRepository<OrdinaryInfo, Long> {
}
