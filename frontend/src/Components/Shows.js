import React,{useState,useEffect} from 'react';
import axios from 'axios';


function Shows() {
    
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
        <>
            <div className='Body' >
                <div key= {index}>
                    
                    <img src ={shows.image.medium} alt ={shows.name+"picture"} /> 
                    <h1 >{shows.name}</h1>
                    <p>{"Genres ["+shows.genres+"]"}</p>
                    
                </div>
            </div>
        </>
        );
    });

    
};

export default Shows;