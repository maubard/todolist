package org.marion.todolist.api.todo;

import com.google.common.base.Preconditions;
import org.marion.todolist.util.RestPreconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    // Create a new element by using service
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Todo resource) {
        Preconditions.checkNotNull(resource);
        return service.create(resource);
    }

    // Update given element using id and the service
    @PutMapping("/{id}")
    public Todo update(@PathVariable("id") Long id, @RequestBody Todo resource) {
        Preconditions.checkNotNull(resource);
        RestPreconditions.checkFound(service.findById(resource.getId()));
        return service.update(resource);
    }

    // Delete element using the service, given its id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        RestPreconditions.checkFound(service.findById(id));
        service.deleteById(id);
    }
}
