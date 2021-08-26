package edu.eci.Task.service;

import edu.eci.Task.data.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class TaskHashMap implements TaskService{

    private final HashMap<String, Task> tasks = new HashMap();

    @Override
    public Task create(Task task) {
        tasks.put(task.getId(), task);
        return task;
    }

    @Override
    public Task findById(String id) {
        if(tasks.containsKey(id)){
            return tasks.get(id);
        }
        return null;
    }

    @Override
    public List<Task> all() {
        List<Task> tasksList = new ArrayList();
        for(Task t: tasks.values()){
            tasksList.add(t);
        }
        return tasksList;
    }

    @Override
    public Boolean deleteById(String id) {
        return tasks.remove(id,tasks.get(id));
    }

    @Override
    public Task update(Task task, String id) {
        tasks.put(id, task);
        return task;
    }
}
