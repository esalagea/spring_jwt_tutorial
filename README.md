# spring_jwt_tutorial

Code for the tutorial at https://www.javainuse.com/spring/boot-jwt. 

Run the appication: 

```bash
java -jar jwt-tutorial-${version}.jar
```


To authenticate, send a POST request to  http://localhost:8080/authenticate

with JSON request body: 

`{
    "username" : "emil", 
    "password" : "emil_password" 
}`




Send a get request to http://localhost:8080/hello using Authorization header with value: 

`Bearer <Token received in the authentication reply>`
