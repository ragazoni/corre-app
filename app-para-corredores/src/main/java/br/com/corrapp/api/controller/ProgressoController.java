package br.com.corrapp.api.controller;

import br.com.corrapp.model.Progresso;
import br.com.corrapp.service.ProgressoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class ProgressoController {

    private final ProgressoService progressoService;

    public ProgressoController(ProgressoService progressoService) {
        this.progressoService = progressoService;
    }

    public ResponseEntity<Progresso> createProgresso(@RequestBody Progresso progresso){
        Progresso saveProgresso = progressoService.createProgresso(progresso);
        return ResponseEntity.ok(saveProgresso);
    }
}
