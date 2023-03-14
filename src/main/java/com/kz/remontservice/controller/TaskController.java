package com.kz.remontservice.controller;

import com.kz.remontservice.converter.TaskConverter;
import com.kz.remontservice.model.dto.TaskDTO;
import com.kz.remontservice.model.entity.Task;
import com.kz.remontservice.service.TaskService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/tasks")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaskController {

    TaskService taskService;
    TaskConverter taskConverter;

    @GetMapping
    public ResponseEntity<List<Task>> getAll() {
        return ResponseEntity.ok(taskService.getAll());
    }

    @PostMapping
    public void addTask(@RequestBody TaskDTO taskDTO) {
        Task task = taskConverter.convertTaskDto(taskDTO);
        taskService.save(task);
    }

}
