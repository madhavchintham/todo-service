package com.chintham.todo.service.controller;

import com.chintham.todo.service.dto.TaskCreateRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(TaskController.class)
@AutoConfigureMockMvc
public class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();


    @Test
    void shouldSaveTask() throws Exception {
        TaskCreateRequest request = new TaskCreateRequest();
        request.setTaskName("Pay Internet Bill");

        String json = objectMapper.writeValueAsString(request);

        mockMvc.perform(post("/api/v1/tasks")
                .contentType("application/json")
                .content(json))
                .andExpect(status().isCreated());


    }
}
