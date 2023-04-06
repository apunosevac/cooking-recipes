import React from "react";
import { useState, useEffect } from "react";
import { Card, Container, Col, Button } from "react-bootstrap";
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
    return <Col><Card>
      <Card.Img variant="top" src={require(`../img/${recipe.imagePath}.png`)} />
      <Card.Body>
        <Card.Title><b>{recipe.recipeName}</b></Card.Title>
        <Card.Text><b>Ingredients:</b><br></br>
          {recipe.recipeText}
        </Card.Text>
        <Button variant="primary">Preparation</Button>
      </Card.Body>
    </Card></Col>
  });

  return (
    <Container style={{ marginLeft: 100, marginTop: 50 }}>
      <div>{groupList}</div>
    </Container>
  )
};

export default Recipes;
