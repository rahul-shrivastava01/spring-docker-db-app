package com.local.spring_docker_db_app.controller;

import com.local.spring_docker_db_app.Employees;
import com.local.spring_docker_db_app.EmployeesRepository;
import com.local.spring_docker_db_app.Users;
import com.local.spring_docker_db_app.UsersRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {

    private final EmployeesRepository employeesRepository;
    private final UsersRepository usersRepository;

    public AppController(EmployeesRepository employeesRepository, UsersRepository usersRepository){
        this.employeesRepository = employeesRepository;
        this.usersRepository = usersRepository;
    }

    @GetMapping("/home")
    public String display(){
        return "Name is Rahul!";
    }

    @GetMapping(value = "/all")
    public List<Employees> displayAll(){
        List<Employees> result = new ArrayList<>();
        Iterable<Employees> all = employeesRepository.findAll();
        for(Employees e : all){
            result.add(e);
        }
        return result;
    }

    @GetMapping("/create")
    @Transactional
    public String createUser(@RequestParam(name = "mark") String name){
        Users user = new Users();
        // No need to add id as hibernate will automatically create a new id
        user.setUserAdd("Pune");
        user.setUserName(name);
        usersRepository.save(user);
        return "User ".concat(name).concat(" created!");
    }

}
