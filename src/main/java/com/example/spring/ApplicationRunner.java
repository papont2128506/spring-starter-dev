package com.example.spring;

import com.example.spring.db.pool.ConnectionPool;
import com.example.spring.db.repository.CompanyRepository;
import com.example.spring.db.repository.UserRepository;
import com.example.spring.ioc.Container;
import com.example.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {

        var container = new Container();

        var connectionPool = container.get(ConnectionPool.class);
        var userRepository = container.get(UserRepository.class);
        var companyRepository = container.get(CompanyRepository.class);
        var userService = container.get(UserService.class);


//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository();
//        var userService = new UserService(userRepository, companyRepository);
        //TODO userService


    }
}
