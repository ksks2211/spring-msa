package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetTodos() {
        // Map<String, List<TodoDTO>>
        ResponseEntity<TodoListResponse> response = restTemplate.getForEntity("/todos", TodoListResponse.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());

        TodoListResponse body = response.getBody();
        List<TodoDTO> todos = body.getTodos();
        assertNotNull(response.getBody());
        assertNotNull(response.getBody().getTodos());
    }

    @Test
    void testCreateTodo(){
        var title = "Hello World";
        TodoCreateRequest reqBody = new TodoCreateRequest(title);

        ResponseEntity<TodoCreateSuccessResponse> response = restTemplate.postForEntity("/todos", reqBody, TodoCreateSuccessResponse.class);

        TodoCreateSuccessResponse resBody = response.getBody();

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertNotNull(resBody.getId());
    }

}
