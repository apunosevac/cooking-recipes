package com.apunosevac.project.recipes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apunosevac.project.recipes.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

     List<Recipe> findAll();

     List<Recipe> findAllByRecipeName(String recipeName);

     List<Recipe> findAllByChefName(String chefName);
    
}
