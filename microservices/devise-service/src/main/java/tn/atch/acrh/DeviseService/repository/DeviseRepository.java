package tn.atch.acrh.DeviseService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.arch.model.Devise;

@Repository
public interface DeviseRepository extends JpaRepository<Devise, Long> {

	List<Devise> findByClientId(Long clientId);
    // Additional custom query methods can be defined here if needed
}