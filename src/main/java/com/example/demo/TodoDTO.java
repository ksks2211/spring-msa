package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rival
 * @since 2024-01-10
 */
@Data
@NoArgsConstructor
public class TodoDTO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("completed")
    private boolean completed;
}
