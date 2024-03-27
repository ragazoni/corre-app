package br.com.corrapp.repository;

import br.com.corrapp.model.PlanoTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoTreinoRepository extends JpaRepository<PlanoTreino, Long> {
}
