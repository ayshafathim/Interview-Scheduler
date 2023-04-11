package com.UST.Interview_Scheduler.service;

import com.UST.Interview_Scheduler.Repo.Urepository;
import com.UST.Interview_Scheduler.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class Userservice {
    @Autowired
    private Urepository repo;
    public User createuser(User user) {
        return repo.save(user);

    }

    public List<User> getUser() {
        return repo.findAll();

    }

    public User getUserById(int id) {
        return repo.findById(id).orElse(null);
    }

    public User getUserByEmail(String email) {
        return repo.findByEmail(email);
    }
}








