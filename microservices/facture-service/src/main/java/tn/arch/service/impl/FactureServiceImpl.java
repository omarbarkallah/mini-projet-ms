package tn.arch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.arch.model.Facture;
import tn.arch.repository.FactureRepository;
import tn.arch.service.FactureService;

import java.util.List;
import java.util.Optional;

@Component
public class FactureServiceImpl implements FactureService {
    @Autowired
    FactureRepository factureRepository;
//    @Autowired
//    ProductService productService;
    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture getFactureById(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public Facture createFacture(Facture facture) {
        return null;
    }

//    @Override
//    public Facture createFacture(Facture facture) {
//        facture.getProductPurchased().forEach(
//                product -> {
//                    facture.setAmount(facture.getAmount()+productService.getProductById(product.getId()).getPrice());
//                });
//        return factureRepository.save(facture);
//    }

    @Override
    public Facture updateFacture(Long id, Facture facture) {
        Optional<Facture> existingFacture = factureRepository.findById(id);
        if (existingFacture.isPresent()) {
            facture.setId(id);
            return factureRepository.save(facture);
        }
        return null; // Handle not found scenario
    }

    @Override
    public void deleteFacture(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public List<Facture> getFacturesByClientId(Long clientId) {
        return factureRepository.findByClientId(clientId);
    }
}
