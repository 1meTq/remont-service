package com.kz.remontservice.service.impl;

import com.kz.remontservice.model.entity.Task;
import com.kz.remontservice.repository.TaskRepository;
import com.kz.remontservice.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Task task) {
        taskRepository.save(task);
    }
}
