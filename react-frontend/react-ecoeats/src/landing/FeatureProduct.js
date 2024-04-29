import React, {useEffect, useState} from "react";
import {Link} from "react-router-dom";

function FeatureProduct({product}) {
    const {name, price, description, image} = product;
    let offPrice = `${price}SEK`;
    if (product.percentOff && product.percentOff > 0) {
        offPrice = (
            <>
                <del>{price}Ks</del>
                {price - (product.percentOff * price) / 100}SEK
            </>
        );
    }

    return (
        <div className="col-12 col-lg-4 mb-4">
            <div className="card shadow-sm h-100">
                <div className="card-img-top-wrapper">
                    <img className="card-img-top cover" alt="" src={image}/>
                </div>
                <div className="card-body">
                    <h5 className="card-title text-center">{name}</h5>
                    <p className="card-text text-center text-muted">{offPrice}</p>
                    <p className="card-text text-center description-text">{description}</p>
                    <div className="d-grid gap-10">
                        <Link to={`/products/${product.id}`} className="btn btn-outline-dark" replace>
                            Detail
                        </Link>
                    </div>
                </div>
            </div>
        </div>
    );
}

const FeatureProducts = () => {
    const [products, setProducts] = useState([]);

    useEffect(() => {
        const fetchProducts = async () => {
            try {
                const response = await fetch("http://localhost:8089/products");
                let data = await response.json();
                data = data.map(product => {
                    const imageName = product.image.split('/').pop(); // get the last part of the URL (e.g., "Image1")
                    let correctImageName;

                    switch (imageName) {
                        case 'Image':
                            correctImageName = 'honey.jpg';
                            break;
                        case 'Image1':
                            correctImageName = 'eggs.jpg';
                            break;
                        case 'Image2':
                            correctImageName = 'milk.jpg';
                            break;
                        case 'Image3':
                            correctImageName = 'redwine.jpg';
                            break;
                        case 'Image4':
                            correctImageName = 'fruits.jpg';
                            break;
                        case 'Image5':
                            correctImageName = 'beefs.jpg';
                            break;
                        // add more cases as needed...
                        default:
                            correctImageName = imageName;
                    }

                    return {
                        ...product,
                        image: `http://localhost:8089/uploads/${correctImageName}`
                    };
                });

                setProducts(data);
            } catch (error) {
                console.error('Error:', error);
            }
        };

        fetchProducts();
    }, []);

    return (
        <div className="container">
            <h2 className="text-center mb-4">Feature Products</h2>
            <div className="row">
                {products.map((product) => (
                    <FeatureProduct key={product.id} product={product}/>
                ))}
            </div>
        </div>
    );
}

export default FeatureProducts;