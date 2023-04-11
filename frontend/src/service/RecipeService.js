import axios from 'axios'

const RECIPE_REST_API_URL = 'http://localhost:8080/recipe';

class RecipeService {

    getUsers(){
        return axios.get(RECIPE_REST_API_URL);
    }

    saveRecipe(recipe){
        return axios.post(RECIPE_REST_API_URL + "/saveRecipe", recipe);
    }
}

export default new RecipeService();