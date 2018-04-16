package com.itplayer.manage.device;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.device.entity.OrdinaryInfo;
import com.itplayer.core.device.query.DeviceInfoQueryModel;
import com.itplayer.core.device.service.DeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device/deviceInfo")
public class DeviceInfoController extends BaseController {

    @Autowired
    private DeviceInfoService deviceInfoService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody OrdinaryInfo ordinaryInfo) {
        deviceInfoService.create(ordinaryInfo);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody OrdinaryInfo ordinaryInfo) {
        deviceInfoService.update(ordinaryInfo);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        deviceInfoService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<OrdinaryInfo> areas = deviceInfoService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody DeviceInfoQueryModel queryModel) {
        PageResult<OrdinaryInfo> pageResult = deviceInfoService.queryPage(queryModel);
        return success(pageResult);
    }
}
