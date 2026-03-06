package com.campusplant.controller;

import com.campusplant.model.Plant; // Assuming there is a Plant model
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plants")
public class PlantController {

    // Method to get all plants
    @GetMapping
    public ResponseEntity<List<Plant>> getAllPlants() {
        // Logic to retrieve all plants
        return ResponseEntity.ok().body(/* Retrieve plants */);
    }

    // Method to get a single plant by ID
    @GetMapping("/{id}")
    public ResponseEntity<Plant> getPlantById(@PathVariable Long id) {
        // Logic to retrieve a single plant
        return ResponseEntity.ok().body(/* Retrieve plant by ID */);
    }

    // Method to create a new plant
    @PostMapping
    public ResponseEntity<Plant> createPlant(@RequestBody Plant plant) {
        // Logic to save a new plant
        return ResponseEntity.status(201).body(/* Save plant */);
    }

    // Method to update an existing plant
    @PutMapping("/{id}")
    public ResponseEntity<Plant> updatePlant(@PathVariable Long id, @RequestBody Plant plant) {
        // Logic to update an existing plant
        return ResponseEntity.ok().body(/* Update plant */);
    }

    // Method to delete a plant
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlant(@PathVariable Long id) {
        // Logic to delete a plant
        return ResponseEntity.noContent().build();
    }
}