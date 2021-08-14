package br.ifg.edu.poo2.neuber.bolao.services;

import br.ifg.edu.poo2.neuber.bolao.entities.Participante;
import br.ifg.edu.poo2.neuber.bolao.repositories.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> findAll(){
        return participanteRepository.findAll();
    }

    public Participante findById(Integer id){
        return participanteRepository.findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Participante insert(Participante participante){
        return participanteRepository.save(participante);
    }

    public void delete(Integer id){
        participanteRepository.findById(id).map(
                participante -> {participanteRepository.delete(participante);
                return Void.TYPE;}
        ).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void update(Integer id, Participante obj){
        participanteRepository.findById(id).map(
                participante -> {
                    participante.setNome(obj.getNome());
                    participante.setRamal(obj.getRamal());
                    participante.setEMail(obj.getEMail());
                    return participanteRepository.save(participante);
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
