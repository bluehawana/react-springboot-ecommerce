import BannerZero from "./banner-0.jpg";
import BannerOne from "./banner-1.jpg";
import BannerTwo from "./banner-2.jpg";

function BannerIncidator(props) {
  return (
    <button
      type="button"
      data-bs-target="#bannerIndicators"
      data-bs-slide-to={props.index}
      className={props.active ? "active" : ""}
      aria-current={props.active}
    />
  );
}

function BannerImage(props) {
    return (
        <div className={"carousel-item " + (props.active ? "active" : "")} data-bs-interval="5000">
            <img className="d-block w-100 cover banner-image" alt="" src={props.image} />
            <div className="carousel-caption d-none d-lg-block">
                <h3>{props.title}</h3>
                <h5>{props.description}</h5>
            </div>
        </div>
    );
}

function Banner() {
  return (
      <div id="bannerIndicators" className="carousel slide" data-bs-ride="carousel" style={{ marginTop: "56px" }}>
        <div className="carousel-indicators">
          <BannerIncidator index="0" active={true} />
          <BannerIncidator index="1" />
          <BannerIncidator index="2" />
        </div>
        <div className="carousel-inner">
          <BannerImage image={BannerZero} active={true} title="Eco Eats" description="A new style of eating habits not only for you but also for our world!" />
          <BannerImage image={BannerOne} title="Healthy Choices" description="Delicious and nutritious meals to fuel your day." />
          <BannerImage image={BannerTwo} title="Sustainable Living" description="Join us in making eco-friendly choices for a greener future." />
        </div>
      </div>
  );
}

export default Banner;
