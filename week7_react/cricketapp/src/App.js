import React from 'react';

function ListofPlayers() {
  const players = [
    { name: "Player 1", score: 85 },
    { name: "Player 2", score: 65 },
    { name: "Player 3", score: 78 },
    { name: "Player 4", score: 45 },
    { name: "Player 5", score: 88 },
    { name: "Player 6", score: 60 },
    { name: "Player 7", score: 90 },
    { name: "Player 8", score: 55 },
    { name: "Player 9", score: 74 },
    { name: "Player 10", score: 69 },
    { name: "Player 11", score: 95 }
  ];
  const filtered = players.filter(p => p.score >= 70);
  return (
    <div>
      <h2>List of Players with Score >= 70</h2>
      <ul>{filtered.map((p, i) => <li key={i}>{p.name}: {p.score}</li>)}</ul>
    </div>
  );
}

function IndianPlayers() {
  const T20 = ["T20-1", "T20-2", "T20-3"];
  const Ranji = ["Ranji-1", "Ranji-2"];
  const merged = [...T20, ...Ranji];
  const [oddPlayers, evenPlayers] = [
    merged.filter((_, i) => i % 2 === 0),
    merged.filter((_, i) => i % 2 !== 0)
  ];
  return (
    <div>
      <h2>Indian Players</h2>
      <p>Odd Players: {oddPlayers.join(", ")}</p>
      <p>Even Players: {evenPlayers.join(", ")}</p>
    </div>
  );
}

function App() {
  const flag = true;
  return (
    <div>
      <h1>Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
