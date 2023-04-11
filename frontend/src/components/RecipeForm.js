import React from "react";
import {useState} from 'react';
import recipeService from '../service/RecipeService.js';
function RecipeForm() {
    const [recipe, setRecipe] = useState({
        recipeName: "",
        imagePath: "",
        ingredients: "",
        preparation: "",
    });
    const [msg, setMsg] = useState("")

    const handleChange = (e) => {
        const value = e.target.value;
        setRecipe({ ...recipe, [e.target.name]: value })
    }

    const RegisterUser = (e) => {
        e.preventDefault();
        console.log(recipe);
        recipeService.saveRecipe(recipe)
            .then((res) => {
                console.log("Recipe Added Successfully");
                setMsg("Recipe Added Sucessfully");
                setRecipe({
                    recipeName: "",
                    imagePath: "",
                    ingredients: "",
                    preparation: "",
                })
            }).catch((error) => {
                console.log(error);
            });
    }
    return (
        <>
            <div className='container mt-3'>
                <div className='row'>
                    <div className='col-md-6 offset-md-3'>
                        <div className='card'>
                            <div className='card-header fs-3 text-center'>
                                Add recipe
                            </div>
                            {msg && <p className="fs-4 text-center text-success">{msg}</p>}
                            <div className='card-body'>
                                <form onSubmit={(e) => RegisterUser(e)}>
                                    <div className='mb-3'>
                                        <label>Name</label>
                                        <input type="text" name="recipeName" className='form-control' onChange={(e) => handleChange(e)}
                                            value={recipe.recipeName} />
                                    </div>
                                    <div className='mb-3'>
                                        <label>Image path</label>
                                        <input type="text" name="imagePath" className='form-control'
                                            onChange={(e) => handleChange(e)}
                                            value={recipe.imagePath} />
                                    </div>
                                    <div className='mb-3'>
                                        <label>Ingredients</label>
                                        <textarea name="ingredients" className='form-control'
                                            onChange={(e) => handleChange(e)}
                                            value={recipe.ingredients}></textarea>
                                    </div>
                                    <div className='mb-3'>
                                        <label>Preparation</label>
                                        <textarea name="preparation" className='form-control'
                                            onChange={(e) => handleChange(e)}
                                            value={recipe.preparation}></textarea>
                                    </div>
                                    <button className="btn btn-primary col-md-12">Submit</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default RecipeForm;