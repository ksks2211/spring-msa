package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author rival
 * @since 2024-01-10
 */

@ExtendWith(MockitoExtension.class)
class TodoServiceTest {

    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;


    @Test
    public void testSave(){
        // Given
        String title = "Sleep early";
        TodoCreateRequest form = new TodoCreateRequest(title);
        Todo savedTodo = new Todo(1L,title, false);
        when(todoRepository.save(any(Todo.class))).thenReturn(savedTodo);

        // When
        Long savedTodoId = todoService.saveTodo(form);

        assertNotNull(savedTodoId);
        assertEquals(1L, savedTodoId.longValue());

        //  Verify that save is called on the repository
        verify(todoRepository).save(any(Todo.class));
    }

}