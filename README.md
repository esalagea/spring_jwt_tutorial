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

`Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJlbWlsIiwiZXhwIjoxNjEwNjU1OTU0LCJpYXQiOjE2MTA2Mzc5NTR9.6BQ6Hy5KM2jazfytrNIf5oifE28yTd6JmTayDEQuKVJSKVD85a9YOj_N7_q7qpnmbf5SLJY3nH8YkhiENAie_g`
