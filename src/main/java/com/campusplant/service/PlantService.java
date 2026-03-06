package com.campusplant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PlantService {
    // A list to hold plant objects (you might want to replace this with a database connection)
    private List<Plant> plantList = new ArrayList<>();
    // A map to track view counts for each plant
    private Map<Integer, Integer> viewCounts = new HashMap<>();

    // Method to search for plants by name
    public List<Plant> searchPlants(String name) {
        List<Plant> result = new ArrayList<>();
        for (Plant plant : plantList) {
            if (plant.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(plant);
            }
        }
        return result;
    }

    // Method to get plants by category
    public List<Plant> getPlantsByCategory(String category) {
        List<Plant> result = new ArrayList<>();
        for (Plant plant : plantList) {
            if (plant.getCategory().equalsIgnoreCase(category)) {
                result.add(plant);
            }
        }
        return result;
    }

    // Method to track view count for a plant
    public void trackViewCount(int plantId) {
        viewCounts.put(plantId, viewCounts.getOrDefault(plantId, 0) + 1);
    }

    // Optionally: Method to get view count for a specific plant
    public int getViewCount(int plantId) {
        return viewCounts.getOrDefault(plantId, 0);
    }

    // Method to add a plant (for manipulation in tests or real scenarios)
    public void addPlant(Plant plant) {
        plantList.add(plant);
    }
}

// Example Plant class (you might have your own implementation)
class Plant {
    private int id;
    private String name;
    private String category;

    public Plant(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
}