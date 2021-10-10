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

<h3 align="Left">Assumptions:</h3>

- Chosen Java SpringBoot for API development as it gives flexibility and faster development capabilities.
- Chosen mysql as database and used Workbench v8.0.
- Model first approach is chosen for development.
- Add Movie and Add user has to be the first calls made to insert user and a movie to the database. This forms the basis for making other calls to the API.
- MovieID and UserID  are automatically assigned by auto increments while inserting to the table. Ideally, these details would be sent to the user as an email after registration.
- Inorder to search a movie/user  by ID,  get ID by peeking into the database.
- Database would have 3 tables namely user, movie and user_favorites. user_favorites has many to many relationship between user and movie.
- GetMovieByTitle needs an exact movie title to return a result.
- GetMovieTitleWith needs a substring from a movie name to search and list all the movie having substring as a part of its title.
    for ex: search string "inc" searches and lists both Incredibles and Inception
- GetFavorites/Id lists a users favorites movie and its details along with user details.


<h3 align="Left">Installation</h3>

	1. Clone the repo
       git clone https://github.com/sridharke7/movierack.git
	2. Open pom.xml as a project in your IDE
	3. Change the database port in application.properties file according to your machine config. It is set as 3306 for now.
	4. Change the username and password in application properties as per your mysql instance</p>
  
<h3 align="Left">How to use?</h3>
Once local environment is prepared, repository is cloned and built without errors in local machine, it automatically creates necessary tables in mysql database. This is because of model first approach followed in this project.

Type  | API End Points                     | Details
------|----------------------------------  | --------------------------------------------------
Post  | /api/addMovie                      | Expands Movie Racks collection by adding a movieid
Get   | /api/GetMovieByGenre/{genre}       | Find movies by genre 
Get   | /api/GetMovieByTitle/{title}       | Find a movie by Title
Get   | /api/GetMovies                     | Shows movies on execute
Get   | /api/GetMoviesById/{movieid}       | find a movie by id
Get   | /api/GetMovieTitleWith/{title}     | Find movies with a search keyword
Post  | /api/addUser                       | Add an user to Movie Rack
Put   | /api/favorite/{userid}/movies/{id} | Like a Movie
Get   | /api/GetFavorites/{id}             | Find favorite movies of an user
Get   | /api/GetUser                       | Find users
Get   | /api/GetUserById/{id}              | Find a user by id

Swagger UI for Movie Rack is accessible through the link 

<http://localhost:8085/swagger-ui.html>

Api Documentation- 

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
