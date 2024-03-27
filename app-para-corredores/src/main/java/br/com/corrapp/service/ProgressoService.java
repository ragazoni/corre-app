package br.com.corrapp.service;

import br.com.corrapp.model.Progresso;
import br.com.corrapp.repository.ProgressoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProgressoService {

    private final ProgressoRepository progressoRepository;

    public ProgressoService(ProgressoRepository progressoRepository) {
        this.progressoRepository = progressoRepository;
    }

    public Progresso createProgresso(Progresso progresso){
        return progressoRepository.save(progresso);

    }
}
