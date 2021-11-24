# spring-boot-issue-28768

1. Run `./mvnw spring-boot:run`.
1. Run `curl --location --request GET 'http://localhost:8080/hello500' --header 'Content-Type: application/json'`
1. Note the output: `{"timestamp":"2021-11-24T09:49:33.345+00:00","status":500,"error":"Internal Server Error","path":"/hello500"}`

Now stop the server, comment out `WorkaroundConfig#removeErrorSecurityFilter` and do the test again. Note the output is empty.
