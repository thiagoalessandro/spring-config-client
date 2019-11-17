# Spring Cloud Config - Client


## Atualizar aplicação

curl -X POST localhost:8080/app-client-spring/actuator/refresh

## Atualizar aplicação de um determinado projeto

curl -X POST –d {} localhost:8090/bus/refresh?destination=test-app2:**
