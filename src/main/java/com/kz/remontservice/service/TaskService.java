package com.kz.remontservice.service;

import com.kz.remontservice.model.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAll();

    void save(Task task);

}
