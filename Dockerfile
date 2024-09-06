# from the base image of a jdk 11 container on Ubuntu 20.04.
FROM openjdk:17-jdk-slim

# create a work dir.
WORKDIR /app

# copy a jvm app.
COPY appjar/*.jar app.jar

# open port 8080 for a jvm app.
EXPOSE 8080

# startup a jvm app.
ENTRYPOINT ["java","-jar","app.jar"]
