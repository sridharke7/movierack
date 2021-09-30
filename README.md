# movierack
<h3 align="Left">About The Project</h3>

MovieRack api is a REST api that is a centralized repository of movies. It has popular movie titles with their description, genre and number of users favorited a movie. 
Movie Rack is growing both in its movie collection and user base.

This API supports

		A) getting a list of movies filterable by a query and
		B) details for a specific movie.
		C) favorite a specific movie.
		D) get a list of favorited movies.

<h3 align="Left">Technologies</h3>
Movie Rack is built with popular technologies

          • Spring boot
          • Java 11
          • Spring boot
          • JPA repositories
          • Swagger 2
          • mysql 

<h3 align="Left">Getting Started</h3>
This is an example of how you may give instructions on setting up your project locally. To get a local copy up and running follow these simple example steps.

<h3 align="Left">Prerequisites</h3>
Here are the list of things to prepare your development machine for setting up this project

           • Java 11
           • my sql database instance
           • Spring boot starter
           • any IDE like IntelliJ/STS/Eclipse

<h3 align="Left">Installation</h3>

	1. Clone the repo
       git clone https://github.com/sridharke7/movierack.git
	2. Open pom.xml as a project in your IDE
	3. Change the database port in application.properties file according to your machine config. It is set as 3306 for now.
	4. Change the username and password in application properties as per your mysql instance</p>
  
<h3 align="Left">How to use?</h3>
Once local environment is prepared, repository is cloned and built without errors in local machine, it automatically creates necessary tables in mysql database. This is because of model first approach followed in this project.

API End Points                     | Details
---------------------------------- | --------------------------------------------------
/api/addMovie                      | Expands Movie Racks collection by adding a movieid
/api/GetMovieByGenre/{genre}       | Find movies by genre 
/api/GetMovieByTitle/{title}       | Find a movie by Title
/api/GetMovies                     | Shows movies on execute
/api/GetMoviesById/{movieid}       | find a movie by id
/api/GetMovieTitleWith/{title}     | Find movies with a search keyword
/api/addUser                       | Add an user to Movie Rack
/api/favorite/{userid}/movies/{id} | Like a Movie
/api/GetFavorites/{id}             | Find favorite movies of an user
/api/GetUser                       | Find users
/api/GetUserById/{id}              | Find a user by id

Swagger API for Movie Rack is accessible through the link 

<http://localhost:8085/swagger-ui.html>

Api Documentation through PostMan- 

<http://localhost:8085/v2/api-docs>

<b>Add a movie using below Post request sample</b>
```
{
  "description": "Dreams",
  "genre": "Action",
  "rating": 4,
  "title": "Inception"
}
```

<b>Add User using below post request sample</b>

```
{
  "favoritegenre": "Romance",
  "username": "Sridhar Kesavan"
}
```

<b>Favorite a movie using below put request sample</b>

```
id - 1
userid 1
```
*refer database for movieid and user id


<b>You are ready to go !</b>
Now try out several other API end points as per the swagger documentation

<h2 align="Left">Contact</h2>

Name:  <b>Sridhar Kesavan</b>

Email: <b>sridharke7@gmail.com</b>

Project Link:  https://github.com/sridharke7/movierack
