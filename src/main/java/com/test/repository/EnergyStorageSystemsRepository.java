package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyStorageSystemsRepository extends JpaRepository<EnergyStorageSystems, Long>{

    EnergyStorageSystems findByCostEffectiveness(boolean costEffectiveness);

    EnergyStorageSystems findByEfficiency(boolean efficiency);

    EnergyStorageSystems findByReliability(boolean reliability);

    EnergyStorageSystems findBySecurity(boolean security);

}