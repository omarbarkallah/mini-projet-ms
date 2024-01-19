package tn.arch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.arch.model.Reglement;
import tn.arch.repository.ReglementRepository;
import tn.arch.service.ReglementService;

@Component
public class ReglementServiceImpl implements ReglementService {

    @Autowired
    private ReglementRepository reglementRepository;

    @Override
    public Reglement getById(Long id) {
        try {
            return reglementRepository.findById(id)
                    .orElseThrow(() -> new Exception("reglement not found with id " + id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Reglement create(Reglement reglement) {
        return reglementRepository.save(reglement);
    }

    @Override
    public Reglement update(Long id, Reglement reglement) {
        getById(id);
        reglement.setId(id);
        return reglementRepository.save(reglement);
    }

    @Override
    public void delete(Long id) {
        Reglement existingReglement = getById(id);
        reglementRepository.delete(existingReglement);
    }
}

