package com.example.demo.note;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NoteConfig {

    @Bean
    CommandLineRunner commandLineRunner(NoteRepository repository){
            return args ->{
                Note alpha = new Note("cane");
                Note beta = new Note("gatto");
                repository.saveAll(List.of(alpha,beta));
        };
    }
}
