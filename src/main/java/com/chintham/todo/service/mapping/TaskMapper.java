package com.chintham.todo.service.mapping;

import com.chintham.todo.service.dto.TaskCreateRequest;
import com.chintham.todo.service.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mapping(target = "name", source = "taskName")
    @Mapping(target = "due", source = "dueDateTime")
    Task dtoToEntity(TaskCreateRequest request);
}
