package br.ifg.edu.poo2.neuber.bolao.resources;

import br.ifg.edu.poo2.neuber.bolao.entities.Participante;
import br.ifg.edu.poo2.neuber.bolao.services.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    @RequestMapping(value="/{id}")
    public ResponseEntity<Participante> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(participanteService.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Participante> insert(@RequestBody Participante participante){
        participante = participanteService.insert(participante);
        return ResponseEntity.ok().body(participante);
    }

    @DeleteMapping(value = "/id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        participanteService.delete(id);
    }

    @PutMapping(value = "/id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update (@PathVariable Integer id, @RequestBody Participante participante){
        participanteService.update(id, participante);
    }


}
