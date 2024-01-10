package com.example.demo;

import lombok.Data;

import java.util.List;

/**
 * @author rival
 * @since 2024-01-10
 */
@Data
public class TodoListResponse {
    private List<TodoDTO> todos;
}
