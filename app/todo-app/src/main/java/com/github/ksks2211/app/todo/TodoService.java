package com.github.ksks2211.app.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rival
 * @since 2024-02-18
 */
@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    public Long saveTodo(TodoCreateRequest form){
        // Mapping
        String title = form.getTitle();
        Todo todo = Todo.builder().title(title).build();

        return todoRepository.save(todo).getId();
    }

    public TodoListResponse getAllTodos(){

        List<TodoDTO> todos = todoRepository.findAll().stream().map(this::fromEntityToDto).collect(Collectors.toList());
        TodoListResponse result = new TodoListResponse();
        result.setTodos(todos);

        return result;
    }

    public TodoDTO fromEntityToDto(Todo entity){
        TodoDTO dto = new TodoDTO();
        dto.setCompleted(entity.isCompleted());
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());

        return dto;
    }
}
