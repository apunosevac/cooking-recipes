import React from "react";
import { Card, Container, Row, Col, Button } from "react-bootstrap";
import chocolateTart from "C:/Users/Punosevac/Desktop/cooking-recipes/src/img/chocolateTart.png";
import "./recipes.css";

const Recipes = () => {
  return (
    <Container style={{ marginLeft: 100, marginTop: 50 }}>
      <Row>
        <Col>
          <Card className='card'>
            <Card.Img variant="top" src={chocolateTart}/>
            <Card.Body>
              <Card.Title><b>Lisa’s chocolate and almond tart</b></Card.Title>
              <Card.Text>
                Some quick example text to build on the card title and make up
                the bulk of the card's content.
              </Card.Text>
              <Button variant="primary">Go somewhere</Button>
            </Card.Body>
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
      <Row>
        <Col>
          <Card className='card'>
            <Card.Img variant="top" src={chocolateTart}/>
            <Card.Body>
              <Card.Title><b>Lisa’s chocolate and almond tart</b></Card.Title>
              <Card.Text>
                Some quick example text to build on the card title and make up
                the bulk of the card's content.
              </Card.Text>
              <Button variant="primary">Go somewhere</Button>
            </Card.Body>
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
};

export default Recipes;
