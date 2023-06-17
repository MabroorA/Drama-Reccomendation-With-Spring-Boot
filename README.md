# K-Drama Recommender Application (KRecomendo)
KRecomendo will be a web application developed using Spring Boot, Docker, and AWS that aims to provide an engaging and personalized K-Drama watching experience to users.
The application will utilize machine learning algorithms to analyze user preferences and generate tailored recommendations based on their interests in K-Dramas.

# Technology Stack

Spring Boot: Backend framework for building RESTful APIs and managing data persistence.

Docker: Containerization platform to package the application and its dependencies.

AWS: Utilize AWS services for hosting, machine learning, and deployment.

# Current Progress

Currently, the project has been initially been setup using Spring Boot project,the necessary dependencies have been configured.
- Api connection has been made using a external "https://www.tvmaze.com/" api
  - Enpoints
     -  */search/shows* Lists all shows
     -  */shows?q=:query* Example: https://api.tvmaze.com/search/shows?q=girls

# Next Steps
Creating the rest of the endpoints such as single show search,show by actor, show by year ect.
