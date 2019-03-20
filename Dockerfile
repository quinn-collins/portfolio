# Docker multi-stage build

# 1. Building the App with Maven
FROM maven:3.6-jdk-8

ADD . /portfolio
WORKDIR /portfolio

RUN ls -la

RUN mvn clean install

# 2. Use build artifact then remove build-container

FROM openjdk:8-jdk

MAINTAINER Quinn Collins

VOLUME /tmp

# Add Spring Boot app.jar to Container
COPY --from=0 "/portfolio/backend/target/backend-1.0-SNAPSHOT.jar" app.jar

ENV JAVA_OPTS=""

# Start Spring Boot app by default
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
