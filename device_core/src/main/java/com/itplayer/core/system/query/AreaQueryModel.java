package com.itplayer.core.system.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.DateUtils;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.system.entity.Area;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaQueryModel extends QueryModel<Area> {

//    public ExampleMatcher buildMatcher() {
//        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
//        if (StrUtils.isNotNull(area.getAreaName())) {
//            exampleMatcher = ExampleMatcher.matching().withMatcher("areaName", ExampleMatcher.GenericPropertyMatchers.contains());
//        }
//
//        return exampleMatcher;
//    }
//
//    public Example<Area> buildExample() {
//        Example<Area> example = Example.of(area, buildMatcher());
//        return example;
//    }

    private String areaName;

    private Date startDate;

    private Date endDate;


    public Specification<Area> buildSpecification() {
        Specification<Area> querySpecifi = new Specification<Area>() {
            @Override
            public Predicate toPredicate(Root<Area> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (startDate != null) {
                    //大于或等于传入时间
                    predicates.add(cb.greaterThanOrEqualTo(root.get("createDate").as(Date.class), startDate));
                }
                if (endDate != null) {
                    predicates.add(cb.lessThanOrEqualTo(root.get("createDate").as(Date.class), endDate));
                }
                if (StrUtils.isNotNull(areaName)) {
                    //模糊查找
                    predicates.add(cb.like(root.get("areaName").as(String.class), "%" + areaName + "%"));
                }

                // and到一起的话所有条件就是且关系，or就是或关系
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return querySpecifi;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void createOrder() {
        addOrders("updateDate", Sort.Direction.DESC);
    }
}
