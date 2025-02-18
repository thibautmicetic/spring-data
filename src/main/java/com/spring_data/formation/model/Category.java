package com.spring_data.formation.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "categorie_produit", joinColumns = @JoinColumn(name = "categorie_id"), inverseJoinColumns = @JoinColumn(name = "produit_id"))
    private List<Product> products;

}
