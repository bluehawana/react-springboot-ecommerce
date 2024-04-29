// src/landing/NewsItems.js
import React from 'react';

const newsItems = [
  "Nyheter: Nu hittar du plommon i fruktlådan.",
  "Workshop: Nu erbjuder vi en workshop i vintillverkning på Ekbackens Gård.",
  "Kosläpp: Kosläpp kl.11-12 den 25 maj 2024 på Ängslycka Gård.",
  "Kundbetyg: Vi har fått betyg 4.8/5.0 av våra kunder!"
];

function NewsItems() {
  return (
    <div className="news-items">
      <ul>
        {newsItems.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>
  );
}

export default NewsItems;