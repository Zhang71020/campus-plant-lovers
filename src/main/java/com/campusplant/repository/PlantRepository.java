package com.campusplant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campusplant.model.Plant;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {
    // Custom query methods can be defined here
    List<Plant> findByCommonName(String commonName);
    List<Plant> findByFamily(String family);
}