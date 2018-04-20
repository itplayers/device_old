package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.BbuDeviceInfo;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caijun.yang on 2018/4/17
 */
public class BbuDeviceInfoQueryModel extends QueryModel<BbuDeviceInfo> {

    private Long deviceId;


    public Specification<BbuDeviceInfo> buildSpecification() {
        Specification<BbuDeviceInfo> querySpecifi = new Specification<BbuDeviceInfo>() {
            @Override
            public Predicate toPredicate(Root<BbuDeviceInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();

                if (deviceId != null) {
                    //模糊查找
                    predicates.add(cb.equal(root.get("areaName").as(Long.class), deviceId));
                }
                // and到一起的话所有条件就是且关系，or就是或关系
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return querySpecifi;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
}
