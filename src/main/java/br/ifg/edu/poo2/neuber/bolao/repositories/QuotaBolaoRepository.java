package br.ifg.edu.poo2.neuber.bolao.repositories;

import br.ifg.edu.poo2.neuber.bolao.entities.QuotaBolao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotaBolaoRepository extends JpaRepository<QuotaBolao, Integer> {
}
