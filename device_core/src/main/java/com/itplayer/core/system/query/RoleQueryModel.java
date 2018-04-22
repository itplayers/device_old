package com.itplayer.core.system.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.system.entity.Manager;
import com.itplayer.core.system.entity.Role;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class RoleQueryModel extends QueryModel<Role> {
    private String roleName;

    @Override
    public Specification<Role> buildSpecification() {
        Specification<Role> specification = new Specification<Role>() {
            @Override
            public Predicate toPredicate(Root<Role> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<Predicate>();
                if (StrUtils.isNotNull(roleName)) {
                    predicates.add(criteriaBuilder.like(root.get("realName").as(String.class), "%" + roleName + "%"));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return specification;
    }

    public String getRealName() {
        return roleName;
    }

    public void setRealName(String realName) {
        this.roleName = realName;
    }
}
