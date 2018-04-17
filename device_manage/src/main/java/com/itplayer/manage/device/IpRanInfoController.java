package com.itplayer.manage.device;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.device.entity.IpRanInfo;
import com.itplayer.core.device.query.IpRanInfoQueryModel;
import com.itplayer.core.device.service.IpRanInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device/ipRanInfo")
public class IpRanInfoController extends BaseController {

    @Autowired
    private IpRanInfoService ipRanInfoService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody IpRanInfo ipRanInfo) {
        ipRanInfoService.create(ipRanInfo);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody IpRanInfo ipRanInfo) {
        ipRanInfoService.update(ipRanInfo);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        ipRanInfoService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<IpRanInfo> areas = ipRanInfoService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody IpRanInfoQueryModel queryModel) {
        PageResult<IpRanInfo> pageResult = ipRanInfoService.queryPage(queryModel);
        return success(pageResult);
    }
}
