import React from "react";
import { Nav, NavLink, NavMenu } 
    from "./NavbarElements";
  
const Navbar = () => {
  return (
    <>
      <Nav>
        <NavMenu>
          <NavLink to="/home" activeStyle>
            Home
          </NavLink>
          <NavLink to="/recipes" activeStyle>
            Recipes
          </NavLink>
          <NavLink to="/newRecipe" activeStyle>
            Add a recipe
          </NavLink>
          <NavLink to="/about" activeStyle>
            About
          </NavLink>
        </NavMenu>
      </Nav>
    </>
  );
};
  
export default Navbar;