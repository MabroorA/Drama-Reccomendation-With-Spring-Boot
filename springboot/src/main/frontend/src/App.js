import React, {useState,useEffect} from 'react';
import './App.css';
import axios from 'axios';

const Shows = () =>{
  const [shows,setshows] = useState([]);




  const fetchShows = () => {
    axios.get("http://localhost:8080/shows").then(res =>{
      console.log(res);

      setshows (res.data);


    });
  };

  useEffect(() => {
    fetchShows();
  }, []);

  return shows.map((shows, index) => {

    return (
      <div key= {index}>
        <h1>{shows.name}</h1>
        <p>{shows.genres}</p>
      </div>
    );
  });

};

function App() {
  return (
    <div className="App">
    <Shows/>
    </div>
  );
}

export default App;
