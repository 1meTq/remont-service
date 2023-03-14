package com.kz.remontservice.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskDTO {

    String description;
    String address;
    int price;
    Long categoryId;
    Long userId;

}
