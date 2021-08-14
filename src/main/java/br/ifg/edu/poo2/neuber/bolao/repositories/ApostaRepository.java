package br.ifg.edu.poo2.neuber.bolao.repositories;

import br.ifg.edu.poo2.neuber.bolao.entities.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta, Integer> {

}
