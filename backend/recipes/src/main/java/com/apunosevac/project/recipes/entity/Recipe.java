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

    @Column(name = "text")
    private String recipeText;

    @ManyToOne
    @JoinColumn(name = "chef_id")
    private Chef chef;
    

    public Recipe() {
    }

    public Recipe(String imagePath, String recipeName, String recipeText, Chef chef) {
        this.imagePath = imagePath;
        this.recipeName = recipeName;
        this.recipeText = recipeText;
        this.chef = chef;
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

    public String getRecipeText() {
        return this.recipeText;
    }

    public void setRecipeText(String recipeText) {
        this.recipeText = recipeText;
    }

    public Chef getchef() {
        return this.chef;
    }

    public void setchef(Chef chef) {
        this.chef = chef;
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

    public Recipe recipeText(String recipeText) {
        setRecipeText(recipeText);
        return this;
    }

    public Recipe chef(Chef chef) {
        setchef(chef);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", imagePath='" + getImagePath() + "'" +
            ", recipeName='" + getRecipeName() + "'" +
            ", recipeText='" + getRecipeText() + "'" +
            ", chef='" + getchef() + "'" +
            "}";
    }


}
