package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.EnergyStorageSystemsService;

@RestController
public class EnergyStorageSystemsController {

    @Autowired
    private EnergyStorageSystemsService energyStorageSystemsService;

    @GetMapping("/getAllEnergyStorageSystems")
    public List<EnergyStorageSystems> getAllEnergyStorageSystems() {
        return energyStorageSystemsService.getAllEnergyStorageSystems();
    }

    @GetMapping("/getCostEffectiveEnergyStorageSystems")
    public List<EnergyStorageSystems> getCostEffectiveEnergyStorageSystems() {
        return energyStorageSystemsService.getCostEffectiveEnergyStorageSystems();
    }

    @GetMapping("/getEfficientEnergyStorageSystems")
    public List<EnergyStorageSystems> getEfficientEnergyStorageSystems() {
        return energyStorageSystemsService.getEfficientEnergyStorageSystems();
    }

    @GetMapping("/getReliableEnergyStorageSystems")
    public List<EnergyStorageSystems> getReliableEnergyStorageSystems() {
        return energyStorageSystemsService.getReliableEnergyStorageSystems();
    }

    @GetMapping("/getSecureEnergyStorageSystems")
    public List<EnergyStorageSystems> getSecureEnergyStorageSystems() {
        return energyStorageSystemsService.getSecureEnergyStorageSystems();
    }

}