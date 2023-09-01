import React, { Component } from 'react';
import './App.css';
import Shows from './Components/Shows';
import NavBar from './Components/NavBar';
import Actors from './Components/pages/Actors';
import Home from './Components/pages/Home';
import { Route,Routes } from 'react-router-dom';

function App() {
  
  
  
  return (
    <>

      
    <NavBar/>
    <div className='container'>
      <Routes>
        <Route path ="/" element={<Home/>} />
        <Route path ="/shows" element={<Shows/>} />
        <Route path ="/Actors" element={<Actors/>} />

        
      </Routes>
    </div>


    </>
  );
}

export default App;
