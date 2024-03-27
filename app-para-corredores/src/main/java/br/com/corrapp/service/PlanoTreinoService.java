package br.com.corrapp.service;

import br.com.corrapp.model.PlanoTreino;
import br.com.corrapp.repository.PlanoTreinoRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanoTreinoService {
    private final PlanoTreinoRepository planoTreinoRepository;

    public PlanoTreinoService(PlanoTreinoRepository planoTreinoRepository) {
        this.planoTreinoRepository = planoTreinoRepository;
    }

    public PlanoTreino salvarPlanoTreino(PlanoTreino planoTreino){
        return planoTreinoRepository.save(planoTreino);
    }
}
