FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/tareaN1-emergentes-0.0.1-SNAPSHOT.jar /api-v1.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/api-v1.jar"]