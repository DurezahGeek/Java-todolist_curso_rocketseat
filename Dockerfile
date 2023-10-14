FROM ubuntu:latest As build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN apt-get install maven -y
RUN mvn clean install
FROM openjdk:17-jdk-slim
COPY target/todolist-1.0.0.jar /app.jar
FROM openjdk:17-jdk-slim
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]

