# Spring MSA

> This project is structured as a multi-module Spring Boot application.
> The primary goal is to study and understand msa.

## Checklist

### spring gateway

### monitoring
- [ ] spring boot admin
- [ ]

----
## spring boot admin
- [ ] spring admin

### build
- [ ] docker build

``` shell
# network
docker network create spring-network

# Admin 
docker build -t spring-admin:latest -f Dockerfile.admin .
docker run -d -p 8080:8080 --name spring-admin --network spring-network spring-admin


# .env
vi .env
ADMIN_CLIENT_URL=http://spring-admin:8080

# Clients
docker build -t spring-client:latest -f Dockerfile.client .
docker run -d -p 8081:8081 --name spring-client --env-file .env --network spring-network spring-client
docker run -d -p 8082:8081 --name spring-client2 --env-file .env --network spring-network spring-client
docker run -d -p 8083:8081 --name spring-client3 --env-file .env --network spring-network spring-client
```



