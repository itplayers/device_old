package com.itplayer.core.device.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.device.entity.EngineRoom;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EngineRoomQueryModel extends QueryModel<EngineRoom> {


    private String roomName;


    @Override
    public Specification<EngineRoom> buildSpecification() {
        Specification<EngineRoom> specification = new Specification<EngineRoom>() {
            @Override
            public Predicate toPredicate(Root<EngineRoom> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();

                if (StrUtils.isNotNull(roomName)) {
                    //模糊查找
                    predicates.add(criteriaBuilder.like(root.get("roomName").as(String.class), "%" + roomName + "%"));
                }

                // and到一起的话所有条件就是且关系，or就是或关系
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return specification;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
