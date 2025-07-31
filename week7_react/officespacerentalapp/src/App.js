import React from 'react';

function App() {
  const officeSpaces = [
    { name: "Space A", rent: 45000, address: "Hyderabad" },
    { name: "Space B", rent: 75000, address: "Bangalore" },
    { name: "Space C", rent: 60000, address: "Chennai" }
  ];

  return (
    <div>
      <h1>Office Space Rental</h1>
      <img src="https://via.placeholder.com/150" alt="Office" />
      <ul>
        {officeSpaces.map((office, i) => (
          <li key={i} style={{ color: office.rent > 60000 ? 'green' : 'red' }}>
            {office.name} - ₹{office.rent} - {office.address}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
