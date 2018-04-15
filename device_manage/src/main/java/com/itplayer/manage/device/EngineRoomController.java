package com.itplayer.manage.device;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.device.entity.EngineRoom;
import com.itplayer.core.device.query.EngineRoomQueryModel;
import com.itplayer.core.device.service.EngineRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device/engineRoom")
public class EngineRoomController extends BaseController {

    @Autowired
    private EngineRoomService engineRoomService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody EngineRoom engineRoom) {
        engineRoomService.create(engineRoom);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody EngineRoom engineRoom) {
        engineRoomService.update(engineRoom);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        engineRoomService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<EngineRoom> areas = engineRoomService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody EngineRoomQueryModel queryModel) {
        PageResult<EngineRoom> pageResult = engineRoomService.queryPage(queryModel);
        return success(pageResult);
    }
}
