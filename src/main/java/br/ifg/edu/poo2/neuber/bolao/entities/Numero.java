package br.ifg.edu.poo2.neuber.bolao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
public class Numero {
    private static final long serialVersionUID = 1L;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Setter
    @Column (unique = true)
    private int numero;


}
