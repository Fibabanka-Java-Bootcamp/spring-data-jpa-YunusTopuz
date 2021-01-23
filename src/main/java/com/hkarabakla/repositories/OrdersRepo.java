package com.hkarabakla.repositories;

import com.hkarabakla.entities.Category;
import com.hkarabakla.entities.User;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository<Category, Integer> {
	
	User findByName(String name);

    List<User> findAllByNameContainingIgnoreCase(String name);

    List<User> findAllByIdLessThanAndName(Integer id, String name);

}
