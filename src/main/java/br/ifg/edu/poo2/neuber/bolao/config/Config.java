package br.ifg.edu.poo2.neuber.bolao.config;

import br.ifg.edu.poo2.neuber.bolao.entities.Numero;
import br.ifg.edu.poo2.neuber.bolao.repositories.NumeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private NumeroRepository numeroRepository;

    @Override
    public void run(String...args) throws Exception{

        if(numeroRepository.count() == 0) {
            for (int i = 1; i <=100; i++){
                numeroRepository.save(new Numero(i));
            }
        }
    }
}
