
import React from 'react';
import "../Stylesheets/mystyle.css";

function CalculateScore() {
  const student = {
    name: "John Doe",
    school: "ABC School",
    total: 450,
    goal: 500
  };

  const avg = student.total / 5;

  return (
    <div className="box">
      <h2>Score Calculator</h2>
      <p>Name: {student.name}</p>
      <p>School: {student.school}</p>
      <p>Average Score: {avg}</p>
      <p>Goal: {student.goal}</p>
    </div>
  );
}

export default CalculateScore;
