package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repository.EnergyStorageSystems;
import com.test.repository.EnergyStorageSystemsRepository;

@Service
public class EnergyStorageSystemsService {

    @Autowired
    private EnergyStorageSystemsRepository energyStorageSystemsRepository;

    public List<EnergyStorageSystems> getAllEnergyStorageSystems() {
        return energyStorageSystemsRepository.findAll();
    }

    public List<EnergyStorageSystems> getCostEffectiveEnergyStorageSystems() {
        return energyStorageSystemsRepository.findByCostEffectiveness(true);
    }

    public List<EnergyStorageSystems> getEfficientEnergyStorageSystems() {
        return energyStorageSystemsRepository.findByEfficiency(true);
    }

    public List<EnergyStorageSystems> getReliableEnergyStorageSystems() {
        return energyStorageSystemsRepository.findByReliability(true);
    }

    public List<EnergyStorageSystems> getSecureEnergyStorageSystems() {
        return energyStorageSystemsRepository.findBySecurity(true);
    }

}