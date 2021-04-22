package org.marion.todolist.api.todo;

import org.marion.todolist.util.RestPreconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/todos")
class TodoController {

    @Autowired
    private TodoService service;

    // Find all elements from service
    @GetMapping
    public List<Todo> findAll() {
        return service.findAll();
    }

    // Get one element from service by id
    @GetMapping("/{id}")
    public Todo findById(@PathVariable("id") Long id) {
        return RestPreconditions.checkFound(service.findById(id));
    }

    // POST (create one)

    // PUT update

    // DELETE
}
