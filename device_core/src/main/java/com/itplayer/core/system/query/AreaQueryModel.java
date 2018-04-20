package com.itplayer.core.system.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.system.entity.Area;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

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


    public Specification<Area> buildSpecification() {
        Specification<Area> querySpecifi = new Specification<Area>() {
            @Override
            public Predicate toPredicate(Root<Area> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (area.getCreateDate() != null) {
                    //大于或等于传入时间
                    predicates.add(cb.greaterThanOrEqualTo(root.get("commitTime").as(String.class), "yyyyy-MM-dd hh:mm:ss"));
                }
                if (area.getUpdateDate() != null) {
                    //小于或等于传入时间
                    predicates.add(cb.lessThanOrEqualTo(root.get("commitTime").as(String.class), "yyyyy-MM-dd hh:mm:ss"));
                }
                if (StrUtils.isNull(area.getAreaName())) {
                    //模糊查找
                    predicates.add(cb.like(root.get(area.getAreaCode()).as(String.class), "%" + area.getAreaName() + "%"));
                }
                // and到一起的话所有条件就是且关系，or就是或关系
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return querySpecifi;
    }
}
