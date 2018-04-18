package com.itplayer.manage.system;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.system.entity.Manager;
import com.itplayer.core.system.query.AreaQueryModel;
import com.itplayer.core.system.query.ManagerQueryModel;
import com.itplayer.core.system.service.AreaService;
import com.itplayer.core.system.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys/manager")
public class ManagerController extends BaseController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody Manager manager) {
        managerService.create(manager);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody Manager manager) {
        managerService.update(manager);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        managerService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<Manager> areas = managerService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody ManagerQueryModel managerQueryModel) {
        PageResult<Manager> pageResult = managerService.queryPage(managerQueryModel);
        return success(pageResult);
    }

}
