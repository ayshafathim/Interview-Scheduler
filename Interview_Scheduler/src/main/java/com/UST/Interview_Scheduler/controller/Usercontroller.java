package com.UST.Interview_Scheduler.controller;

import com.UST.Interview_Scheduler.model.User;
import com.UST.Interview_Scheduler.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/a")
public class Usercontroller {
    @Autowired

    private Userservice service;
    @PostMapping("/addemps")
    public User addEmployee(@RequestBody User user) {

        return service.createuser(user);

    }

    @GetMapping("/b")
    public List<User> getAllEmployees(){
        return service.getUser();
    }

    @GetMapping ("/b/{Id}")
    public User getByEmployeeId(@PathVariable int Id) {
        return service.getUserById(Id);
    }
@GetMapping("/b/getbyemail/{email}")
    public User getUserByEmail(@PathVariable String email){
        return service.getUserByEmail(email);
}
}