package com.foodapp.foodapp.model;

import jakarta.annotation.ManagedBean;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name" ,nullable=false)
    private String name;
    @Column(name = "descriprion",columnDefinition = "varchar(255) default 'John Snow'")
    private String description;
    @Column(name = "price" ,nullable=false)
    private Double price;
    private boolean favorite = false;
    private Double star;
    private String tags;
    @Column(name = "image" ,nullable=false)
    private String imageUrl;
    private String cookTime;
    private String origins;
    // categoryId!:number;

}
