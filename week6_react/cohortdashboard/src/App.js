
import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    { name: "React Bootcamp", status: "ongoing", participants: 30 },
    { name: "Java Basics", status: "completed", participants: 25 }
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
