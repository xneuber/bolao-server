package br.ifg.edu.poo2.neuber.bolao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Numero {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Setter
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
}
