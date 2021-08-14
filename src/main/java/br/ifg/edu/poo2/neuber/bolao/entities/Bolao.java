package br.ifg.edu.poo2.neuber.bolao.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Bolao {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private int concurso;

    @Getter
    @Setter
    @Column(nullable = false)
    private Date dataSorteio;

    @Getter
    @Setter
    @Column(nullable = false)
    private float valorCota;

    @Getter
    @Setter
    @Column(nullable = false)
    private float numCotas;

   /* @Getter
    @ManyToMany
    @JoinTable(name="participante", @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name="id"))
    private List<Participante> participantes= new ArrayList<>();

    public void addParticipante(Participante participante){
        this.participantes.add(participante);
    }

    @Getter
    @Setter
    @ManyToOne
    @JoinTable(name="tipo_jogo", @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name="id"))
    private TipoJogo tipoJogo;

    @Setter
    @ManyToMany
    @JoinTable(name="aposta", @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name="id"))
    private List<Aposta> apostas = new ArrayList<>();*/
}
