package com.spring_data.formation.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "commentaire")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentaire_id")
    private int commentaryId;

    @Column(name = "contenu")
    private String content;

    @Column(name = "produit_id")
    private int productId;

}
