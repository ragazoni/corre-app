package br.com.corrapp.api.controller;

import br.com.corrapp.model.Treino;
import br.com.corrapp.service.TreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreinoController {
    private final TreinoService treinoService;

    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    @PostMapping(value = "/treinos")
    public ResponseEntity<Treino> createTreino(@RequestBody Treino treino){
        Treino saveTreino = treinoService.salvarTreino(treino);
        return ResponseEntity.ok(saveTreino);
    }


}
