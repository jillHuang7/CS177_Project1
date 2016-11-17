package com.keepitfresh.model;

import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task, Integer>{
}
