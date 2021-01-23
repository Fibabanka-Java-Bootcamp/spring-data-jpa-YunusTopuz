package com.hkarabakla.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hkarabakla.entities.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

	Book findByName(String name);

}
