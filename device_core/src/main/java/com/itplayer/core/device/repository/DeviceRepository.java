package com.itplayer.core.device.repository;

import com.itplayer.core.base.repo.BaseRepository;
import com.itplayer.core.device.entity.Device;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends BaseRepository<Device, Long> {
}
