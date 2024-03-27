package br.com.corrapp.service;

import br.com.corrapp.model.Treino;
import br.com.corrapp.repository.TreinoRepository;
import org.springframework.stereotype.Service;

@Service
public class TreinoService {

    private final TreinoRepository treinoRepository;

    public TreinoService(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    public Treino salvarTreino(Treino treino){
        return treinoRepository.save(treino);
    }
}
