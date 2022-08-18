package com.challenge.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity (name = "usuarios")
@Table(name="user")
@Getter @Setter
@ToString
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer iduser;
    
    @Basic
    @NotEmpty(message = "El mail es obligatorio")
    @Column(name = "user_mail")
    @Email(message = "El mail no tiene el formato adecuado")
    private String email;

    @NotEmpty(message = "La contraseña del usuario no puede estar en blanco")
    @Column(name = "user_password")
    private String password;

    public User() {
    }

    public User(Integer iduser, String email, String password) {
        this.iduser = iduser;
        this.email = email;
        this.password = password;
    }
    
    
}
