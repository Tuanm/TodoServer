package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping(path = "/tasks")
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = service.findAll();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping(path = "/tasks/{id}")
    public ResponseEntity<Task> getTask(@PathVariable Integer id) {
        Task task = service.findById(id);
        return ResponseEntity.ok(task);
    }

    @PostMapping(path = "/tasks/add")
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        return ResponseEntity.ok(service.addTask(task));
    }

    @PutMapping(path = "/tasks/update")
    public ResponseEntity<Task> updateTask(@RequestBody Task task) {
        return ResponseEntity.ok(service.updateTask(task));
    }

    @PostMapping(path = "/tasks/remove/{id}")
    public void removeTask(@PathVariable Integer id) {
        service.removeById(id);
    }
}
