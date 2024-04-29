import Image from "../honey.jpg";
import { Link } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

function Product(props) {
  const { name, image } = props.product;

  return (
      <div className="col-12 col-lg-4 mb-4"> {/* Use col-12 for full width on mobile and col-lg-4 for 1/3 width on large devices */}
        <div className="card shadow-sm h-100">
          <Link to="/products/1" href="!#" replace>
            <img
                className="card-img-top cover"
                alt=""
                src={image}
            />
          </Link>
        </div>
      </div>
  );
}

export default Product;