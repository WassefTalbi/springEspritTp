package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

@OneToOne(mappedBy = "foyer")
private Universite universite;

@OneToMany(mappedBy="foyer")
private Set<Bloc> blocs;
}
