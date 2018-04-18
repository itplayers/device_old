package com.itplayer.manage.device;

import com.itplayer.core.base.exception.SystemException;
import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.base.web.BaseController;
import com.itplayer.core.base.web.ResponseData;
import com.itplayer.core.device.entity.Device;
import com.itplayer.core.device.query.DeviceQueryModel;
import com.itplayer.core.device.query.EngineRoomQueryModel;
import com.itplayer.core.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController extends BaseController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping("/add")
    public ResponseData create(@RequestBody Device device) {
        deviceService.create(device);
        return success();
    }

    @PostMapping("/udpate")
    public ResponseData update(@RequestBody Device device) {
        deviceService.update(device);
        return success();
    }

    @GetMapping("/delete/{id}")
    public ResponseData delete(@PathVariable("id") Long id) {
        deviceService.deleteByPrimaryKey(id);
        return success();
    }

    @GetMapping("/list")
    public ResponseData lists() {
        List<Device> areas = deviceService.findAll();
        return success(areas);
    }

    @PostMapping("/list")
    public ResponseData list(@RequestBody DeviceQueryModel queryModel) {
        PageResult<Device> pageResult = deviceService.queryPage(queryModel);
        return success(pageResult);
    }

    @PostMapping("/import")
    public void improtFile(MultipartFile file,String deviceName) {
        // InputStream is=file.getInpdutStreamg();
        WorkB
        String name = file.getOriginalFilename();
        if (!name.endsWith(".xlsx") && !name.endsWith(".xls")) {
            throw new SystemException("文件格式不正确");
        }
        deviceService.improt(file, deviceName);
    }
}
