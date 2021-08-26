package edu.eci.Task.service;


import edu.eci.Task.data.Task;
import java.util.List;

public interface TaskService {

    Task create(Task task);

    Task findById(String id);

    List<Task> all();

    Boolean deleteById(String id);

    Task update(Task task, String id);
}