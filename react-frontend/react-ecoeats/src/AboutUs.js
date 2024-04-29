// AboutUs.js
import React from 'react';
import aboutUsText from './landing/AboutUsText';


function AboutUs() {
  return (
    <div className="about-container">
      <h1 className="about-title">Om   Oss</h1>
      <p className="about-text">{aboutUsText}</p>
    </div>
  );
}

export default AboutUs;