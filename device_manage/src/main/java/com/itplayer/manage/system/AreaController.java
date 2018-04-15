package com.itplayer.manage.system;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.system.entity.Area;
import com.itplayer.core.system.query.AreaQueryModel;
import com.itplayer.core.system.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys/area")
public class AreaController extends BaseController {

    @Autowired
    private AreaService areaService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody Area area) {
        areaService.create(area);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody Area area) {
        areaService.update(area);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        areaService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<Area> areas = areaService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody AreaQueryModel areaQueryModel) {
        PageResult<Area> pageResult = areaService.queryPage(areaQueryModel);
        return success(pageResult);
    }
}
