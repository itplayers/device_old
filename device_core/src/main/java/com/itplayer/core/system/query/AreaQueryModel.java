package com.itplayer.core.system.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.system.entity.Area;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class AreaQueryModel extends QueryModel<Area> {
    private Area area;

    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        boolean allIsNull = true;
        if (StrUtils.isNotNull(area.getAreaName())) {
            allIsNull = false;
            exampleMatcher = ExampleMatcher.matching().withMatcher("areaName", ExampleMatcher.GenericPropertyMatchers.contains());
        }
        if (allIsNull) {
            super.buildMatcher();
        }
        return exampleMatcher;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Example<Area> buildExample() {
        Example<Area> example = Example.of(area, buildMatcher());
        return example;
    }
}
