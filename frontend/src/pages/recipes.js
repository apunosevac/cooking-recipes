import React from "react";
import { useState, useEffect } from "react";
import { Card, Container, Col, } from "react-bootstrap";
import "./recipes.css";

const Recipes = () => {

  const [groups, setGroups] = useState([]);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    setLoading(true);

    fetch('recipe')
      .then(response => response.json())
      .then(data => {
        setGroups(data);
        setLoading(false);
      })
  }, []);


  if (loading) {
    return <p>Loading...</p>;
  }

  const groupList = groups.map(recipe => {
    return <Col><Card xs={12} sm={4} md={4}>
      <Card.Img variant="top" src={require(`../img/${recipe.image}.png`)} />
      <Card.Body>
        <Card.Title><b>{recipe.recipeName}</b></Card.Title>
        <Card.Text><b>Ingredients:</b><br></br>
          {recipe.recipeIngredients}
          <br></br>
          <br></br>
          <b>Preparation:</b>
          {recipe.preparation}
        </Card.Text>
      </Card.Body>
    </Card></Col>
  });

  return (
    <Container>
      <Col><div>{groupList}</div></Col>
    </Container>
  )
};

export default Recipes;
