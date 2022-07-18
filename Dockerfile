FROM openjdk:11 AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:11
WORKDIR kotlin-rest-demo
COPY --from=build target/*.jar demo-api.jar
ENTRYPOINT ["java", "-jar", "demo-api.jar"]