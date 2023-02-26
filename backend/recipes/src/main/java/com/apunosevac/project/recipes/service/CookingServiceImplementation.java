package com.apunosevac.project.recipes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apunosevac.project.recipes.dao.RecipeRepository;
import com.apunosevac.project.recipes.entity.Recipe;

@Service
public class CookingServiceImplementation implements CookingService{

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public String deleteById(int id) {
        if(recipeRepository.findById(id) != null) {
            recipeRepository.deleteById(id);
            return "Recipe with id(" + id + ") has been deleted!";
        } else{
            return "Recipe with id(" + id + ") is not found!";
        }
    }

    @Override
    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public Recipe findById(int id) {
        return recipeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Recipe> findByName(String recipeName) {
        return recipeRepository.findAllByRecipeName(recipeName);
    }

    @Override
    public List<Recipe> findByChef(String chef) {
        return recipeRepository.findAllByChefName(chef);
    }
    
}
