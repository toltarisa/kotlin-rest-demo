### Spring Boot Kotlin Rest API Example

##### Summary
This project consists of two endpoints, one for creating user and another one is creating address and assign it to user.

##### API's

- User API
- Address API

```
POST /users - creates new user
GET /users/:userId - gets user with given id
POST /users/:userId/address - creates address for given user
```

##### Tech Stack
- Java 11
- Spring Boot
- Spring Data JPA
- Kotlin 1.5.0
- Restful API
- H2 In memory database
- Docker
- Docker compose

##### Prerequisites
- Maven
- Docker

##### Run & Build
```
$ cd demo
$ docker-compose up -d
```

*<b>Application Port is 8082</b>*