package com.satanlabs.service_framework.models.repositories;

import com.satanlabs.service_framework.models.entities.BaseEntity;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created By Abhinav Tripathi
 */
public interface BaseRepository<M extends BaseEntity> extends JpaRepository<M, Long>, JpaSpecificationExecutor<M>, QuerydslPredicateExecutor<M> {
}
