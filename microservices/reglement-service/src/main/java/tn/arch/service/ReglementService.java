package tn.arch.service;

import org.springframework.stereotype.Service;
import tn.arch.model.Reglement;

@Service
public interface ReglementService {
    Reglement getById(Long id);

    Reglement create(Reglement reglement);

    Reglement update(Long id, Reglement reglement);

    void delete(Long id);
}
