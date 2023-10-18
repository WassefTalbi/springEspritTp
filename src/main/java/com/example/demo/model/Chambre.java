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
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long idChambre;
private long numeroChambre;
@Enumerated(EnumType.STRING)
private TypeChambre typeChambre;

@ManyToOne
    private Bloc blocs;
@OneToMany
    private Set<Reservation> reservations ;
}
