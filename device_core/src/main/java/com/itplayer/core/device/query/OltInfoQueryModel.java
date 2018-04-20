package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.OltInfo;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Pageable;
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
public class OltInfoQueryModel extends QueryModel<OltInfo> {

    private Long deviceId;

    @Override
    public Specification<OltInfo> buildSpecification() {
        Specification<OltInfo> specification = new Specification<OltInfo>() {
            @Override
            public Predicate toPredicate(Root<OltInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<Predicate>();
                if (null != deviceId) {
                    predicates.add(criteriaBuilder.equal(root.get("deviceId").as(Long.class), deviceId));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return specification;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
}
