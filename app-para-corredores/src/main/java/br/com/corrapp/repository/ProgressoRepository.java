package br.com.corrapp.repository;

import br.com.corrapp.model.Progresso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressoRepository extends JpaRepository <Progresso, Long> {
}
