package com.itplayer.core.base.page;

import com.itplayer.core.base.entity.BaseEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface Model<T extends BaseEntity> extends java.io.Serializable {


    Specification<T> buildSpecification();


    public Pageable buildPageable();
}
