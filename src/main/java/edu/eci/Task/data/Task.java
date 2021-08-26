package edu.eci.Task.data;

import edu.eci.Task.TaskStatus;
import edu.eci.Task.dto.TaskDto;

import java.util.Date;
import java.util.UUID;

public class Task {
    private String id;
    private String name;
    private String description;
    private TaskStatus status;
    private String assignedTo;
    private Date dueDate;
    private Date created;

    public Task(String name, String description, TaskStatus status, String assignedTo, Date dueDate, Date created){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public Task(TaskDto taskDto){
        this.id = UUID.randomUUID().toString();
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = taskDto.getStatus();
        this.assignedTo = taskDto.getAssignedTo();
        this.dueDate = taskDto.getDueDate();
        this.created = taskDto.getCreated();
    }

    public Task(String id, TaskDto taskDto){
        this.id = id;
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = taskDto.getStatus();
        this.assignedTo = taskDto.getAssignedTo();
        this.dueDate = taskDto.getDueDate();
        this.created = taskDto.getCreated();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}