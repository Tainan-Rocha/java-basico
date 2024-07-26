package edu.tainan.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.tainan.spring_data_jpa.model.User;
import edu.tainan.spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Tainan");
        user.setUsername("tr90040");
        user.setPassword("feliz");

        repository.save(user);

        for (User usuario: repository.findAll()) {
            System.out.println(usuario);
        }
    }
    
}
