FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar /api-v1.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/api-v1.jar"]