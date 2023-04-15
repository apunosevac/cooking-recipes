package com.apunosevac.project.recipes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private int id;

    @Column(name = "image")
    private String imagePath;

    @Column(name = "name")
    private String recipeName;

    @Column(name = "ingredients")
    private String recipeIngredients;

    private String preparation;

    public Recipe() {
    }

    public Recipe(String imagePath, String recipeName, String recipeIngredients, String preparation) {
        this.imagePath = imagePath;
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.preparation = preparation;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getrecipeIngredients() {
        return this.recipeIngredients;
    }

    public void setrecipeIngredients(String recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getPreparation() {
        return this.preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public Recipe id(int id) {
        setId(id);
        return this;
    }

    public Recipe imagePath(String imagePath) {
        setImagePath(imagePath);
        return this;
    }

    public Recipe recipeName(String recipeName) {
        setRecipeName(recipeName);
        return this;
    }

    public Recipe recipeIngredients(String recipeIngredients) {
        setrecipeIngredients(recipeIngredients);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", imagePath='" + getImagePath() + "'" +
            ", recipeName='" + getRecipeName() + "'" +
            ", recipeIngredients='" + getrecipeIngredients() + "'" +
            ", preparation='" + getPreparation() + "'" +
            "}";
    }


}
