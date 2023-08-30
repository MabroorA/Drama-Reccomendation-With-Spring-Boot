import React, { Component } from 'react';
import './App.css';
import Shows from './Components/Shows';
import NavBar from './Components/NavBar';
import Actors from './Components/pages/Actors';
import Home from './Components/pages/Home';


function App() {
  let Component
  switch (window.location.pathname){
    case "/":
      Component = <Home/>
      break
    case "/Shows":
      Component = <Shows/>
      break
    case "/Actors":
      Component = <Actors/>
      break  
  }
  
  
  return (
    <>

      
    <NavBar/>
    <div className='container'>
    {Component}
    </div>


    </>
  );
}

export default App;
