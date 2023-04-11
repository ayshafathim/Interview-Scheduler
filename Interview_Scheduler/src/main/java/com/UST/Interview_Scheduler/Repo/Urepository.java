package com.UST.Interview_Scheduler.Repo;

import com.UST.Interview_Scheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Urepository extends JpaRepository<User,Integer> {


    User findByEmail(String email);
}
