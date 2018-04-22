package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.device.entity.IpRanInfo;
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
public class IpRanInfoQueryModel extends QueryModel<IpRanInfo> {

    private Long deviceId;

    @Override
    public Specification<IpRanInfo> buildSpecification() {
        Specification<IpRanInfo> specification = new Specification<IpRanInfo>() {
            @Override
            public Predicate toPredicate(Root<IpRanInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
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
