package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rival
 * @since 2024-01-10
 */

@DataJpaTest
class TodoRepositoryTest {

    @Autowired
    private TodoRepository todoRepository;




    @Test
    public void testSaveTodo(){

        // Given
        String title = "Brush my teeth";
        Todo todo = Todo.builder().title(title).build();


        // When
        Todo savedTodo = todoRepository.save(todo);


        // Then
        assertNotNull(savedTodo);
        assertEquals(title, savedTodo.getTitle());
        assertFalse(savedTodo.isCompleted());


    }

}