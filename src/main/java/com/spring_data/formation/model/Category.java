package com.spring_data.formation.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categorie")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorie_id")
    private int categoryId;

    @Column(name = "nom")
    private String name;

}
