package br.ifg.edu.poo2.neuber.bolao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Participante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String nome;

    @Getter
    @Setter
    @Column(nullable = false)
    private String ramal;

    @Getter
    @Setter
    @Column(nullable = false)
    private String eMail;

 /*   @ManyToMany(mappedBy = "bolao")
    private List<Bolao> boloes= new ArrayList<>();*/

}
