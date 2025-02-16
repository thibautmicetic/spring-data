package com.spring_data.formation.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produit")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produit_id")
    private int productId;

    @Column(name = "nom")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "cout")
    private int cost;

}
