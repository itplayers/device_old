package com.itplayer.core.base.repo;

import com.itplayer.core.base.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean

//public interface JpaRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

}
