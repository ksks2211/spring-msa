package com.github.ksks2211.app.todo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author rival
 * @since 2024-02-18
 */
@Data
@NoArgsConstructor
public class TodoListResponse {

    @JsonProperty("todos")
    private List<TodoDTO> todos;
}