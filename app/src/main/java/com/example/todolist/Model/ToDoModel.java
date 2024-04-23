package com.example.todolist.Model;

public class ToDoModel {
    private int id,status;
    private String task;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "ToDoModel{" +
                "id=" + id +
                ", status=" + status +
                ", task='" + task + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
