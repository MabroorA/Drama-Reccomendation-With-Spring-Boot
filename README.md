# K-Drama Recommender Application (KRecomendo)
KRecomendo will be a web application developed using Spring Boot, Docker, and AWS that aims to provide an engaging and personalized K-Drama watching experience to users.
The application will utilize machine learning algorithms to analyze user preferences and generate tailored recommendations based on their interests in K-Dramas.

# Technology Stack

Spring Boot: Backend framework for building RESTful APIs and managing data persistence.

React : Frontend framework for beautifying the website and using apis to correctly display/interpret data

Docker: Containerization platform to package the application and its dependencies.

AWS: Utilize AWS services for hosting, machine learning, and deployment.

# Current Progress

Currently, the project has been initially been setup using Spring Boot project,the necessary dependencies have been configured.
- Api connection has been made using a external "https://www.tvmaze.com/" api
  - Enpoints
     -  */search/shows* Lists all shows
     -  */shows?q=:query* Example: https://api.tvmaze.com/search/shows?q=girls
     -  */search/people?q=:query* Example: https://api.tvmaze.com/search/people?q=lauren
- FrontEnd Connected 
  - /shows endpoint is showing all the current shows by name on React
  - React Component Created for Shows showing image, Name and genres of the show
  

# Next Steps
- Create FrontEnd
  - Learn/Work on React to beautify the website and added correct endpoints and structure the layout of the website



