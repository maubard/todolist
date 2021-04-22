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
}
