import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faUser, faShoppingCart, faSignInAlt, faHeadset,faSignOutAlt, faInfoCircle } from "@fortawesome/free-solid-svg-icons";
import { Link } from "react-router-dom";
import { useState } from "react";
import logo from '../logo.png'; // Adjust this path based on your needs

function Header() {

  const [openedDrawer, setOpenedDrawer] = useState(false)

  function toggleDrawer() {
    setOpenedDrawer(!openedDrawer);
  }

  function changeNav(event) {
    if (openedDrawer) {
      setOpenedDrawer(false)
    }
  }

  return (
    <header>
      <nav className="navbar fixed-top navbar-expand-lg navbar-light bg-dark border-bottom">
        <div className="container-fluid">
          <Link className="navbar-brand text-muted" to="/" onClick={changeNav}>
            <img src={logo} alt="Logo" style={{height: '70px'}} />
            <span className="ms-lg-6 h5 text-muted">EcoEats</span>
          </Link>

          <div className={"navbar-collapse offcanvas-collapse " + (openedDrawer ? 'open' : '')}>
            <ul className="navbar-nav ms-auto mb-lg-0">
              <li className="nav-item">
                <Link to="/about" className="nav-link text-muted" onClick={changeNav}>
                  <FontAwesomeIcon icon={faInfoCircle} className="text-muted" />
                  <span style={{fontSize: '20px'}}>Om Oss</span>
                </Link>
              </li>
              <li className="nav-item">
                <Link to="/profile" className="nav-link text-muted" onClick={changeNav}>
                  <FontAwesomeIcon icon={faUser} className="text-muted" />
                  <span style={{fontSize: '20px'}}>Profile</span>
                </Link>
              </li>
              <li className="nav-item">
                <Link to="/cart" className="nav-link text-muted" onClick={changeNav}>
                  <FontAwesomeIcon icon={faShoppingCart} className="text-muted" />
                  <span style={{fontSize: '20px'}}>Kundvagn</span>
                </Link>
              </li>
<li className="nav-item">
                <Link to="/service" className="nav-link text-muted" onClick={changeNav}>
                  <FontAwesomeIcon icon={faHeadset} className="text-muted" />
                  <span style={{fontSize: '20px'}}>KUNDTJÄNST</span>
                </Link>
                </li>
              <li className="nav-item">
                <Link to="/login" className="nav-link text-muted" onClick={changeNav}>
                  <FontAwesomeIcon icon={faSignInAlt} className="text-muted" />
                  <span style={{fontSize: '20px'}}>Login</span>
                </Link>
              </li>
              <li className="nav-item">
                <Link to="/logout" className="nav-link text-muted" onClick={changeNav}>
                  <FontAwesomeIcon icon={faSignOutAlt} className="text-muted" />
                  <span style={{fontSize: '20px'}}>Logout</span>
                </Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
  );
}

export default Header;