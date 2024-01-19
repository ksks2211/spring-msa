package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author rival
 * @since 2024-01-10
 */
@Data
@AllArgsConstructor
public class TodoCreateRequest {
    private String title;
}
