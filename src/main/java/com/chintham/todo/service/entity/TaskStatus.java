package com.chintham.todo.service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "task_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "taskStatus")
    private List<Task> tasks;

}
