package tn.arch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.arch.model.Reglement;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement, Long> {
}
