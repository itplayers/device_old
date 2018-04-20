package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.OrdinaryInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.access.method.P;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class OrdinaryInfoQueryModel extends QueryModel<OrdinaryInfo> {

    private Long deviceId;

    @Override
    public Specification<OrdinaryInfo> buildSpecification() {
        Specification<OrdinaryInfo> specification = new Specification<OrdinaryInfo>() {
            @Override
            public Predicate toPredicate(Root<OrdinaryInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
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
