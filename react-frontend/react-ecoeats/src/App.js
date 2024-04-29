import Template from "./template/Template";
import ProductDetail from "./products/detail/ProductDetail";
import AboutUs from "./AboutUs";
import { Switch, Route } from "react-router-dom";
import Landing from "./landing/Landing";


function App() {
  return (
    <Template>
      <Switch>
        <Route path="/about" component={AboutUs} />
        <Route path="/products" exact>
        </Route>
        <Route path="/products/:slug">
          <ProductDetail />
        </Route>
        <Route path="/" exact>
          <Landing />
        </Route>
      </Switch>
    </Template>
  );
}

export default App;
