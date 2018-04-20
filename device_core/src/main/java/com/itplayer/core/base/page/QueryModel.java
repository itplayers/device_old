package com.itplayer.core.base.page;

import com.itplayer.core.base.entity.BaseEntity;
import com.itplayer.core.base.utils.JsonUtils;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.system.entity.Area;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;

/**
 * Created by caijun.yang 2018-4-15.
 */
public abstract class QueryModel<T extends BaseEntity> implements Model {
    private Long totalCount;
    private Long totalPage;
    private Integer currentPage;
    private Integer pageSize;
    private Map<String, Sort.Direction> orders;


    public static Integer calcStartLine(Integer currentPage, Integer pageSize) {
        return (currentPage - 1) * pageSize;
    }

    public void setTotalCount(Long collectionSize) {
        this.totalCount = collectionSize;
        this.totalPage = collectionSize < pageSize ? 1 : collectionSize / pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage < 1 ? 1 : currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Map<String, Sort.Direction> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Sort.Direction> orders) {
        this.orders = orders;
    }


    public Specification<T> buildSpecification() {
        Specification<T> querySpecifi = new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return querySpecifi;
    }

    public Pageable buildPageable() {
        if (currentPage < 1) {
            currentPage = 0;
        } else {
            currentPage -= 1;
        }
        createOrder();
        if (null != orders && orders.keySet().size() > 0) {
            List<Sort.Order> sortOrders = new LinkedList<>();
            for (Map.Entry<String, Sort.Direction> entry : orders.entrySet()) {
                String key = entry.getKey();
                Sort.Direction value = entry.getValue();
                sortOrders.add(new Sort.Order(value, key));
            }
            Sort sort = new Sort(sortOrders);
            return new PageRequest(currentPage, pageSize, sort);
        }
        return new PageRequest(currentPage, pageSize);
    }

    protected void addOrders(String orderKey, Sort.Direction direction) {
        if (orders == null) {
            orders = new HashMap<String, Sort.Direction>();
        }
        orders.put(orderKey, direction);
    }

    protected void createOrder() {

    }
}
