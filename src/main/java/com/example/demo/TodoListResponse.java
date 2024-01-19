package com.example.demo;

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
    private List<TodoDTO> todos;
}
