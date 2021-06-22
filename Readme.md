1)  In `src/main/resources/application.yml` set property bootstrap-servers to
    1) `kafka:9092` if you will start app in docker
    2) `localhost:9092` if you will start app locally
2) Build project using command
   `mvn clean package spring-boot:repackage`
3) Provide path to consumer dockerfile in `docker-compose.yml` in property
   `services -> counsumer-app -> build -> context: <your local path>`
4) Run command `docker-compose up`

Client API ENDPOINT: `http://localhost:8080/api/clients`

Example of Client POST request:
`
{
"clientId": 2,
"email": "asdaswd"
}
`

Transaction API ENDPOINT: `http://localhost:8080/api/transactions`

Example of Transaction POST request:
`
{
"bank": "Alpha",
"clientId": 2,
"orderType": "INCOME",
"quantity": 2,
"price": -3,
"createdAt": "2016-01-25T21:34:55"
}
`