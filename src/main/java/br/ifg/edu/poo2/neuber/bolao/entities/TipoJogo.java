package br.ifg.edu.poo2.neuber.bolao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class TipoJogo {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false, unique = true)
    private float valorAposta;

    @Getter
    @Setter
    @Column(nullable = false, unique = true)
    private int qtdMinimaAposta;

    @Getter
    @Setter
    @Column(nullable = false, unique = true)
    private int qtdMaximaAposta;


}
