package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rival
 * @since 2024-01-10
 */
@Data
@NoArgsConstructor
public class TodoDTO {
    private Long id;
    private String title;
    private boolean completed;
}
