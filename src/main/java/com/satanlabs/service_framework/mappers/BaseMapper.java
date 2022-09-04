package com.satanlabs.service_framework.mappers;

import com.satanlabs.service_framework.models.entities.BaseEntity;
import org.mapstruct.MappingTarget;

/**
 * Created By Abhinav Tripathi on 30/01/20
 */
public interface BaseMapper<T extends BaseEntity> {
    T merge(T source, @MappingTarget T target);
}
