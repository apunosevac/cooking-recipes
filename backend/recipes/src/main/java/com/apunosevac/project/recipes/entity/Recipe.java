package com.apunosevac.project.recipes.entity;

import java.lang.String;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private int id;

    private String image;

    @Column(name = "name")
    private String recipeName;

    @Column(name = "ingredients")
    private String recipeIngredients;

    private String preparation;

    public Recipe() {
    }

    public Recipe(String image, String recipeName, String recipeIngredients, String preparation) {
        this.image = image;
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

    public String getimage() {
        return this.image;
    }

    public void setimage(String image) {
        this.image = image;
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

    public Recipe image(String image) {
        setimage(image);
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
            ", image='" + getimage() + "'" +
            ", recipeName='" + getRecipeName() + "'" +
            ", recipeIngredients='" + getrecipeIngredients() + "'" +
            ", preparation='" + getPreparation() + "'" +
            "}";
    }


}
