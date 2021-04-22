package org.marion.todolist.api.todo;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
class TodoService {

    public List<Todo> findAll() {
        return Collections.emptyList();
    }

    public Todo findById(Long id) {
        return new Todo(id);
    }

    public Long create(Todo todo) {
        return todo.getId();
    }

    public Todo update(Todo todo) {
        return todo;
    }

    public void deleteById(Long id) {

    }
}
