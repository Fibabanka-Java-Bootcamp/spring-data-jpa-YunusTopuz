package com.hkarabakla.services;

import org.springframework.stereotype.Component;

import com.hkarabakla.entities.Book;
import com.hkarabakla.repositories.BookRepo;

@Component
public class BookService {

    private final BookRepo repo;

    public BookService(BookRepo repo) {
        this.repo = repo;
    }

    public void bookOperations() {
    	Book b = new Book();
        b.setName("Sefiller");

        repo.save(b);

    }
}
