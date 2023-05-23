FROM amazoncorretto:18-alpine-jdk
MAINTAINER IGN
COPY target/backend-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
