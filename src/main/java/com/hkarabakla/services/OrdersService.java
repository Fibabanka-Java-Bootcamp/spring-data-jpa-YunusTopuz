package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;

@Component
public class OrdersService {

    private final UserRepo repo;

    public OrdersService(UserRepo repo) {
        this.repo = repo;
    }

    public void userOperations() {
        User u = new User();
        u.setName("user");

        Address address = new Address();
        address.setStreet("Gazo sokak");
        address.setNumber("7");
        address.setCity("Istanbul");

        u.setAddress(address);

        repo.save(u);

        System.out.println(u.getId());

        System.out.println(repo.findAllByNameContainingIgnoreCase("se"));
    }
}
