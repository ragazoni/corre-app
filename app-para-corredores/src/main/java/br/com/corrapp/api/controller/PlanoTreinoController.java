package br.com.corrapp.api.controller;

import br.com.corrapp.model.PlanoTreino;
import br.com.corrapp.service.PlanoTreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanoTreinoController {
    private final PlanoTreinoService planoTreinoService;

    public PlanoTreinoController(PlanoTreinoService planoTreinoService) {
        this.planoTreinoService = planoTreinoService;
    }

    @PostMapping(value = "/planotreinos")
    public ResponseEntity<PlanoTreino> createPlanoTreino(@RequestBody PlanoTreino planoTreino){
        PlanoTreino savePlanoTreino = planoTreinoService.salvarPlanoTreino(planoTreino);
        return ResponseEntity.ok(savePlanoTreino);
    }


}
