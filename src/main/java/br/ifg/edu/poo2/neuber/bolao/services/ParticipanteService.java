package br.ifg.edu.poo2.neuber.bolao.services;

import br.ifg.edu.poo2.neuber.bolao.entities.Participante;
import br.ifg.edu.poo2.neuber.bolao.repositories.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> findAll(){
        return participanteRepository.findAll();
    }

}
