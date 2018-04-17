package com.itplayer.manage.device;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.device.entity.BbuDeviceInfo;
import com.itplayer.core.device.query.BbuDeviceInfoQueryModel;
import com.itplayer.core.device.query.OrdinaryInfoQueryModel;
import com.itplayer.core.device.service.BbuDeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device/bbuDeviceInfo")
public class BbuDeviceInfoController extends BaseController {

    @Autowired
    private BbuDeviceInfoService bbuDeviceInfoService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody BbuDeviceInfo bbuDeviceInfo) {
        bbuDeviceInfoService.create(bbuDeviceInfo);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody BbuDeviceInfo bbuDeviceInfo) {
        bbuDeviceInfoService.update(bbuDeviceInfo);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        bbuDeviceInfoService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<BbuDeviceInfo> areas = bbuDeviceInfoService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody BbuDeviceInfoQueryModel queryModel) {
        PageResult<BbuDeviceInfo> pageResult = bbuDeviceInfoService.queryPage(queryModel);
        return success(pageResult);
    }
}
