package com.itplayer.manage.device;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.device.entity.OrdinaryInfo;
import com.itplayer.core.device.query.OrdinaryInfoQueryModel;
import com.itplayer.core.device.service.OrdinaryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device/ordinaryInfo")
public class OrdinaryInfoController extends BaseController {

    @Autowired
    private OrdinaryInfoService ordinaryInfoService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody OrdinaryInfo ordinaryInfo) {
        ordinaryInfoService.create(ordinaryInfo);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody OrdinaryInfo ordinaryInfo) {
        ordinaryInfoService.update(ordinaryInfo);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        ordinaryInfoService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<OrdinaryInfo> areas = ordinaryInfoService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody OrdinaryInfoQueryModel queryModel) {
        PageResult<OrdinaryInfo> pageResult = ordinaryInfoService.queryPage(queryModel);
        return success(pageResult);
    }
}
