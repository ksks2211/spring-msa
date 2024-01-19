package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rival
 * @since 2024-01-10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoCreateRequest {
    private String title;
}
