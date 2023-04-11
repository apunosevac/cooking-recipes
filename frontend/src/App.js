import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import { BrowserRouter as Router, Routes, Route }
    from 'react-router-dom';
import Home from './pages';
import About from './pages/about';
import Recipes from './pages/recipes';
import NewRecipe from './pages/newRecipe';

function App() {
    return (
        <Router>
            <Navbar />
            <Routes>
                <Route exact path='/' element={<Home />} />
                <Route exact path='/home' element={<Home />} />
                <Route path='/recipes' element={<Recipes />} />
                <Route path='/newRecipe' element={<NewRecipe />} />
                <Route path='/about' element={<About />} />
            </Routes>
        </Router>
    );
}

export default App;
