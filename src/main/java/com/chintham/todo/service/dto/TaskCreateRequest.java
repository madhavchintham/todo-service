package com.chintham.todo.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class TaskCreateRequest {

    private String taskName;
    private LocalDateTime dueDateTime;

}
