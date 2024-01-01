package com.foodapp.foodapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String email;
    private String firstName;
    private String lastName;

    private String password;
    @ManyToOne
    private Role role;
    @OneToMany(mappedBy = "order_id")
    private List<Order> orders;
}
