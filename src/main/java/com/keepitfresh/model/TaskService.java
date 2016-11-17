package com.keepitfresh.model;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    TaskDao dao;

    public Iterable<Task> retrieveTasks(String user) {
    	return dao.findAll();
    }

    public Task retrieveTask(int id) {
    	return dao.findOne(id);
    }

    public void updateTask(Task task) {
    	dao.save(task);
    }

    public void addTask(String user, String name, String emailAddress, Date expDate) {
    	Task i = new Task(user, name, emailAddress, expDate);
    	dao.save(i);
    }

    public void deleteTask(int id) {
        dao.delete(id);
    }
    
    
}
