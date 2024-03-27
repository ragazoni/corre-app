package br.com.corrapp.service;

import br.com.corrapp.model.Exercicio;
import br.com.corrapp.repository.ExercicioRepository;
import org.springframework.stereotype.Service;

@Service
public class ExercicioService {
    private final ExercicioRepository exercicioRepository;

    public ExercicioService(ExercicioRepository exercicioRepository) {
        this.exercicioRepository = exercicioRepository;
    }

    public Exercicio salvarexercicio(Exercicio exercicio){
        return exercicioRepository.save(exercicio);
    }
}
