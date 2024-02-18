package com.github.ksks2211.app.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author rival
 * @since 2024-02-18
 */
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;


    @Builder
    public Todo(String title){
        this.title=title;
    }


    @Setter
    private boolean completed;
}