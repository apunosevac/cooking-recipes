package com.apunosevac.project.recipes.service;

import java.util.List;

import com.apunosevac.project.recipes.entity.Recipe;

public interface CookingService {

    public List<Recipe> findAll();

    public String deleteById(int id);

    public Recipe save(Recipe nakit);

    public Recipe findById(int id);

    public List<Recipe> findByName(String name);

    public List<Recipe> findByChef(String chef);
    
}
