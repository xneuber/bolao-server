package br.ifg.edu.poo2.neuber.bolao.resources;

import br.ifg.edu.poo2.neuber.bolao.entities.Participante;
import br.ifg.edu.poo2.neuber.bolao.services.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/participantes")
public class ParticipanteResource {

    @Autowired
    private ParticipanteService participanteService;

    @GetMapping
    public ResponseEntity<List<Participante>> findAll(){
        return ResponseEntity.ok().body(participanteService.findAll());
    }

    

}
