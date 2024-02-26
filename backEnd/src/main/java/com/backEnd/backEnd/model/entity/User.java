package com.backEnd.backEnd.model.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "identifer",unique = true,nullable = false)
    private String indentifer;
    @Column(name = "email",unique = true,nullable = false)
    private String email;
    @Column(name = "Full_name",nullable = false)
    private String Full_name ;
    @Column(name = "Password",nullable = false)
    private String Password ;

}
