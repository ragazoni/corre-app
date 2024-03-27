package br.com.corrapp.api.controller;

import br.com.corrapp.model.Exercicio;
import br.com.corrapp.service.ExercicioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {
    private final ExercicioService exercicioService;

    public ExercicioController(ExercicioService exercicioService) {
        this.exercicioService = exercicioService;
    }

    @PostMapping(value = "/exercicios")
    public ResponseEntity<Exercicio> createExercicio(@RequestBody Exercicio exercicio){
        Exercicio saveExercicio = exercicioService.salvarexercicio(exercicio);
        return ResponseEntity.ok(saveExercicio);
    }


}
