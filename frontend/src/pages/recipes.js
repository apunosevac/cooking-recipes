import React from "react";
import { Card, Container, Row, Col, Button } from "react-bootstrap";
import chocolateTart from "../img/chocolateTart.png";
import "./recipes.css";
import RecipeService from "../service/RecipeService";

class Recipes extends React.Component {

  constructor(props) {
    super(props)
    this.state = {
      recipes: []
    }
  }

  componentDidMount() {
    RecipeService.getUsers().then((response) => {
      this.setState({ recipes: response.data })
    });
  }
  render() {
    return (
      <Container style={{ marginLeft: 100, marginTop: 50 }}>
        <Row>
          <Col>
            <Card className='card'>
              {
                this.state.recipes.map(
                  recipe =>
                    <div>
                      {/* <Card.Img variant="top" src={recipe.image} />
                      <Card.Body>
                        <Card.Title><b>{recipe.name}</b></Card.Title>
                        <Card.Text>
                          {recipe.text}
                        </Card.Text>
                        <Button variant="primary">Go somewhere</Button>
                      </Card.Body> */}
                      <tr key={recipe.id}>
                        <td> {recipe.name}</td>
                        <td> {recipe.name}</td>
                      </tr>
                    </div>
                )
              }
            </Card>
          </Col>
          <br></br>
          <Col>
            <Card className='card'>
              <Card.Img variant="top" src={chocolateTart} />
              <Card.Body>
                <Card.Title><b>Card title</b></Card.Title>
                <Card.Text>
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </Card.Text>
                <Button variant="primary">Go somewhere</Button>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>
    );
  }
};

export default Recipes;
