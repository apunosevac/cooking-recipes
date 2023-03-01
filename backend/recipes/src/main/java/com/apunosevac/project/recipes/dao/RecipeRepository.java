package com.apunosevac.project.recipes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apunosevac.project.recipes.entity.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

     List<Recipe> findAll();

     List<Recipe> findAllByRecipeName(String recipeName);

     List<Recipe> findAllByChefName(String chefName);
    
}
