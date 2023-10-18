package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bloc  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long idBloc;
private String nomBloc;
private long capaciteBloc;

@ManyToOne
    private Foyer foyer;
@OneToMany( mappedBy="blocs")
private Set<Chambre> chambres;


}
