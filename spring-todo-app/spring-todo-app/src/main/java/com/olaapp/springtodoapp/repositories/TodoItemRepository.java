package com.olaapp.springtodoapp.repositories;

import com.olaapp.springtodoapp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository <TodoItem, Long> {

}
