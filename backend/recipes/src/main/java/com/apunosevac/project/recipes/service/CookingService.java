package com.apunosevac.project.recipes.service;

import java.util.List;

import com.apunosevac.project.recipes.entity.Recipe;

public interface CookingService {

    List<Recipe> findAll();

    String deleteById(int id);

    Recipe save(Recipe recipe);

    Recipe findById(int id);

    List<Recipe> findByName(String name);

    List<Recipe> findByChef(String chef);
    
}
