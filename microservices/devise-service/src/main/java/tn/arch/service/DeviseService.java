package tn.arch.service;

import org.springframework.stereotype.Service;
import tn.arch.model.Devise;

import java.util.List;

@Service
public interface DeviseService {
    List<Devise> getAllDevises();

    Devise getDeviseById(Long id);

    Devise createDevise(Devise devise);

    Devise updateDevise(Long id, Devise devise);

    void deleteDevise(Long id);

    List<Devise> getDevisesByClientId(Long clientId);
}

