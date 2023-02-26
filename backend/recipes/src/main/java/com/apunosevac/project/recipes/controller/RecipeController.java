package com.apunosevac.project.recipes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apunosevac.project.recipes.entity.Recipe;
import com.apunosevac.project.recipes.service.CookingService;

@RestController
public class RecipeController {

    @Autowired
    private CookingService service;

    @GetMapping("/recipe")
    public List<Recipe> findAll() {
		return service.findAll();
    }

    @GetMapping("/recipe/id={id}")
    public Recipe findbById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/recipe")
    public Recipe addNew(@RequestBody Recipe recipe){
        return service.save(recipe);
    }

    @PutMapping("/recipe")
    public Recipe editExisting(@RequestBody Recipe recipe) {
        return service.save(recipe);
    }

    @DeleteMapping("recipe/id={id}")
    public String deleteById(@PathVariable("id") int id){
        return service.deleteById(id);
    }

    @GetMapping("/recipe/name={rn}")
    public List<Recipe> findByName(@PathVariable String rn) {
        return service.findByName(rn);
    }

    @GetMapping("/recipe/chef_id={c}")
    public List<Recipe> findByChef(@PathVariable String c) {
        return service.findByChef(c);
    }
    
}
