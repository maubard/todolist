package org.marion.todolist.api.todo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

class Todo implements Serializable {

    @JsonProperty("id")
    Long id;

    public Todo() {

    }

    public Todo(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
