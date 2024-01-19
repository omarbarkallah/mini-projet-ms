package tn.arch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.arch.model.Devise;
import tn.arch.service.DeviseService;
import tn.atch.acrh.DeviseService.repository.DeviseRepository;


import java.util.List;
import java.util.Optional;

@Component
public class DeviseServiceImpl implements DeviseService {
    @Autowired
    DeviseRepository deviseRepository;
//    @Autowired
//    ProductService productService;

    @Override
    public List<Devise> getAllDevises() {
        return deviseRepository.findAll();
    }

    @Override
    public Devise getDeviseById(Long id) {
        return deviseRepository.findById(id).orElse(null);
    }

    @Override
    public Devise createDevise(Devise devise) {
        return null;
    }

//    @Override
//    public Devise createDevise(Devise devise) {
//        devise.getProductToBePurchased().forEach(
//                product -> {
//                    devise.setTotalAmount(devise.getTotalAmount() + productService.getProductById(product.getId()).getPrice());
//                });
//        return deviseRepository.save(devise);
//    }

    @Override
    public Devise updateDevise(Long id, Devise devise) {
        Optional<Devise> existingDevise = deviseRepository.findById(id);
        if (existingDevise.isPresent()) {
            devise.setId(id);
            return deviseRepository.save(devise);
        }
        return null; // Handle not found scenario
    }

    @Override
    public void deleteDevise(Long id) {
        deviseRepository.deleteById(id);
    }

    @Override
    public List<Devise> getDevisesByClientId(Long clientId) {
        return deviseRepository.findByClientId(clientId);
    }
}
