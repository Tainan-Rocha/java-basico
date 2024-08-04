package edu.my_first_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.my_first_web_api.model.Usuario;
import edu.my_first_web_api.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository repository;

    // Retorna users
    @GetMapping("/users")
    public List<Usuario> getUSER(){
        return repository.findAll();
    }

    // Metodo get para retornar um user especifico
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }   

    // Metodo delete para deletar 
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    // Metodo Post que recebe JSON
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
