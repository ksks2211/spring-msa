package com.github.ksks2211.app.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rival
 * @since 2024-02-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoCreateRequest {
    private String title;
}