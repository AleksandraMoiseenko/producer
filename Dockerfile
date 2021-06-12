FROM openjdk:8-jdk-alpine
MAINTAINER aleksandra_moiseenko
COPY /target/ru.kafka.producer-0.0.1-SNAPSHOT.jar ru.kafka.producer-0.0.1.jar
ENTRYPOINT ["java","-jar","/ru.kafka.producer-0.0.1.jar"]