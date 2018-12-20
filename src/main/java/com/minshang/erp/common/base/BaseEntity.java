package com.minshang.erp.common.base;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BaseEntity
 * @Description 公共的实体类
 * @Author 后羿i
 * @Date 2018/12/20
 * @Version 1.0
 **/
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //创建id
    @CreatedBy
    private Long createId;
    //更新id
    @LastModifiedBy
    private Long updateId;
    //创建时间
    @CreatedDate
    @Column(name="create_time",nullable=false,length=19)
    private Date createTime;
    //更新时间
    @LastModifiedDate
    @Column(name="update_time",nullable=false,length=19)
    private Date updateTime;
}