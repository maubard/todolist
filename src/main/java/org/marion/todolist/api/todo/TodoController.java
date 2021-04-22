package org.marion.todolist.api.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
class TodoController {

    @Autowired
    private TodoService service;

    // GET all

    // GET by id

    // POST (create one)

    // PUT update

    // DELETE
}
