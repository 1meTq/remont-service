package com.kz.remontservice.converter;

import com.kz.remontservice.model.dto.TaskDTO;
import com.kz.remontservice.model.entity.Category;
import com.kz.remontservice.model.entity.Task;
import com.kz.remontservice.model.entity.User;
import com.kz.remontservice.service.CategoryService;
import com.kz.remontservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskConverter {

    private final CategoryService categoryService;
    private final UserService userService;

    public Task convertTaskDto(TaskDTO source) {
        Task target = new Task();
        target.setAddress(source.getAddress());
        target.setDescription(source.getDescription());
        target.setPrice(source.getPrice());

        Category category = categoryService.getCategoryById(source.getCategoryId());
        User user = userService.getUserById(source.getUserId());

        target.setCategory(category);
        target.setUser(user);

        return target;
    }

    public TaskDTO convertTask(Task source)  {
        TaskDTO target = new TaskDTO();
        target.setAddress(source.getAddress());
        target.setDescription(source.getDescription());
        target.setPrice(source.getPrice());
        target.setCategoryId(source.getCategory().getId());
        target.setUserId(source.getUser().getId());

        return target;
    }

}
