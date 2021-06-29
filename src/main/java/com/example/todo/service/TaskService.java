package com.example.todo.service;

import com.example.todo.model.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Task addTask(Task task) {
        return repository.save(task);
    }

    public void removeById(Integer id) {
        repository.deleteById(id);
    }

    public Task updateTask(Task task) {
        return repository.save(task);
    }
}
