package com.itplayer.manage.device;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.device.entity.OltInfo;
import com.itplayer.core.device.query.OltInfoQueryModel;
import com.itplayer.core.device.query.OrdinaryInfoQueryModel;
import com.itplayer.core.device.service.OltInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device/oltInfo")
public class OltInfoController extends BaseController {

    @Autowired
    private OltInfoService oltInfoService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody OltInfo oltInfo) {
        oltInfoService.create(oltInfo);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody OltInfo oltInfo) {
        oltInfoService.update(oltInfo);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        oltInfoService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<OltInfo> areas = oltInfoService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody OltInfoQueryModel queryModel) {
        PageResult<OltInfo> pageResult = oltInfoService.queryPage(queryModel);
        return success(pageResult);
    }
}
