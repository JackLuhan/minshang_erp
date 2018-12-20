package com.minshang.erp.common.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * @ClassName BaseRepository
 * @Description 公共dao层
 * @Author 后羿i
 * @Date 2018/12/20
 * @Version 1.0
 **/
@NoRepositoryBean
public interface BaseRepository <T,I extends Serializable> extends PagingAndSortingRepository<T,I>, JpaSpecificationExecutor<T>, JpaRepository<T,I> {
}