package br.com.desafioback.desafio_todolist.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.desafioback.desafio_todolist.entity.Todo;
import br.com.desafioback.desafio_todolist.service.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/todos")
public class TodoController {
    
    @Autowired
    TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> list() {
        List<Todo> todos = todoService.list();
        return ResponseEntity.ok(todos);
    }

    @PostMapping
    public ResponseEntity<List<Todo>> create(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.create(todo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<Todo>> update(@PathVariable("id") Long id, @RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.update(todo));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<List<Todo>> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(todoService.delete(id));
    }
    
}
