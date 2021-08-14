package br.ifg.edu.poo2.neuber.bolao.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Participante implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String nome;

    @Setter
    @Column(nullable = false)
    private String ramal;

    @Setter
    @Column(nullable = false)
    private String eMail;

    @JsonIgnore
    @ManyToMany(mappedBy = "participantes")
    private List<Bolao> boloes= new ArrayList<>();

}
