package com.example.demo;

import lombok.Data;

/**
 * @author rival
 * @since 2024-01-10
 */
@Data
public class TodoDTO {
    private Long id;
    private String title;
    private boolean completed;
}
