package br.ifg.edu.poo2.neuber.bolao.config;

import br.ifg.edu.poo2.neuber.bolao.entities.Numero;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class Config implements CommandLineRunner {

    @Override
    public void run (String... args) throws Exception {

        ArrayList<Numero> numeros = new ArrayList<>();
        for (int i=1; i<100; i++) {
            numeros.add(new Numero(i+1));
        }
    }

}
