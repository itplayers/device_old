package com.itplayer;

import static org.junit.Assert.assertTrue;

import com.itplayer.core.base.page.PageResult;
import com.itplayer.core.system.entity.Area;
import com.itplayer.core.system.query.AreaQueryModel;
import com.itplayer.core.system.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DeviceApplicationTests {
    @Autowired
    private AreaService areaService;

    @Test
    public void save() {
        Area area = new Area();
        area.setAreaCode("11");
        area.setAreaName("泸州");
        area.setCreateDate(new Date());
        area.setUpdateDate(new Date());
        areaService.create(area);
    }

    @Test
    public void update() {
        Area area = new Area();

        area.setId(4L);
        area.setAreaCode("1123");
        area.setAreaName("泸州23");
        area.setCreateDate(new Date());
        area.setUpdateDate(new Date());
        areaService.create(area);
    }

    @Test
    public void delete() {
        areaService.deleteByPrimaryKey(2L);
    }

    @Test
    public void fiandAll() {
        AreaQueryModel pageQueryModel = new AreaQueryModel();
        pageQueryModel.setPageSize(10);
        pageQueryModel.setCurrentPage(1);
        Area area = new Area();
        area.setAreaName("2");
        area.setCreateDate(new Date());
        PageResult<Area> areaPageResult = areaService.queryPage(pageQueryModel);
        System.out.print(areaPageResult);

    }
}