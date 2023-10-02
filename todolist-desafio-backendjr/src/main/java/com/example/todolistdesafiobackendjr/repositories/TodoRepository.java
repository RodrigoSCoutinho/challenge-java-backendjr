package com.example.todolistdesafiobackendjr.repositories;

import com.example.todolistdesafiobackendjr.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoRepository extends JpaRepository<Todo, Long>{

}
