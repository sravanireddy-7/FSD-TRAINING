import logo from './logo.svg';
import './App.css';
import { Link } from 'react-router-dom';
import { Routes, Route } from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";

function App() {
  return (
    <div className="App">
      Hello
      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/contact/:id" element={<Contact />} />
</Routes>
      <nav>
        <Link to="/home">Home</Link>
        <Link to="/about">About</Link>
        <Link to="/contact">Contact</Link>
      </nav>
    </div>
  );
}

export default App;
