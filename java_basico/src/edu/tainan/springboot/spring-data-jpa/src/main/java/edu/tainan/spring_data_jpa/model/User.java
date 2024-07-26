package edu.tainan.spring_data_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity // Definindo uma entidade
@Table(name = "app_user") // Alterando o nome da tabela
public class User { // Classe para definir um usuario

    // Atributos 
    @Id // Definindo o ID da entidade
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false) // Definindo atributo que sera enviado ao db.
    private String name;
    @Column(length = 20, nullable = false) // Definindo atributo que sera enviado ao db.
    private String username;
    @Column(length = 100, nullable = false) // Definindo atributo que sera enviado ao db.
    private String password;

    // Getters

    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // To string
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
    }

    

}
