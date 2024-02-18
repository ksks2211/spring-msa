package com.github.ksks2211.app.todo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author rival
 * @since 2024-02-18
 */
public interface TodoRepository extends JpaRepository<Todo,Long> {
}
