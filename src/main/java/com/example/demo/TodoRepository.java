package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author rival
 * @since 2024-01-10
 */
public interface TodoRepository extends JpaRepository<Todo,Long> {
}
