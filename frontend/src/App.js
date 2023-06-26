import React from 'react';
import './App.css';
import Shows from './Components/Shows';

// const Shows = () =>{
//   const [shows,setshows] = useState([]);




//   const fetchShows = () => {
//     axios.get("http://localhost:8080/shows").then(res =>{
//       console.log(res);

//       setshows (res.data);


//     });
//   };

//   useEffect(() => {
//     fetchShows();
//   }, []);

//   return shows.map((shows, index) => {

//     return (
//       <div key= {index}>
//         <h1>{shows.name}</h1>
//         <p>{shows.genres}</p>
//         <h1>{shows.rat}</h1>
//       </div>
//     );
//   });

// };

function App() {
  return (
    <div >
    <Shows/>


    </div>
  );
}

export default App;
