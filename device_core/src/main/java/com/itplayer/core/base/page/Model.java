package com.itplayer.core.base.page;

import com.itplayer.core.base.entity.BaseEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public interface Model<T extends BaseEntity> extends java.io.Serializable {


    ExampleMatcher buildMatcher();


    Example<T> buildExample();
}
