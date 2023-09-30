package com.chintham.todo.service.controller;

import com.chintham.todo.service.dto.TaskCreateRequest;
import com.chintham.todo.service.dto.TaskDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tasks")
public class TaskController {

    @PostMapping
    public ResponseEntity<TaskDTO> save(@RequestBody TaskCreateRequest request) {
        TaskDTO dto = new TaskDTO();
        dto.setName(request.getTaskName());
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
