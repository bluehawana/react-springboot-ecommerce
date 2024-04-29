import Image from "../beefs.jpg";
import { Link } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

function ProductH(props) {
  const price = 10000;
  let percentOff;
  let offPrice = `${price}Ks`;

  if (props.percentOff && props.percentOff > 0) {
    percentOff = (
      <div
        className="badge bg-dim py-2 text-white position-absolute"
        style={{ top: "0.5rem", left: "0.5rem" }}
      >
        {props.percentOff}% OFF
      </div>
    );

    offPrice = (
      <>
        <del>{price}Ks</del> {price - (props.percentOff * price) / 100}Ks
      </>
    );
  }
  return (
      <div className="col">
        <div className="card shadow-sm">
          <div className="row g-0">
            <div className="col-4">
              <Link to="/products/1" href="!#" replace>
                {percentOff}
                <img
                    className="rounded-start bg-dark cover w-100 h-100"
                    alt=""
                    src={props.image}  // Use the passed image prop here
                />
              </Link>
            </div>
            {/* ... (rest of the code remains unchanged) */}
          </div>
        </div>
      </div>
  );
}

export default ProductH;
