package com.itplayer.core.system.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.system.entity.Manager;
import com.itplayer.core.system.entity.Permission;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PermissionQueryModel extends QueryModel<Permission> {
    private String name;

    @Override
    public Specification<Permission> buildSpecification() {
        Specification<Permission> specification = new Specification<Permission>() {
            @Override
            public Predicate toPredicate(Root<Permission> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<Predicate>();
                if (StrUtils.isNotNull(name)) {
                    predicates.add(criteriaBuilder.like(root.get("realName").as(String.class), "%" + name + "%"));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return specification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
