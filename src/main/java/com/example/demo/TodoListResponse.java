package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author rival
 * @since 2024-01-10
 */
@Data
@NoArgsConstructor
public class TodoListResponse {

    @JsonProperty("todos")
    private List<TodoDTO> todos;
}
