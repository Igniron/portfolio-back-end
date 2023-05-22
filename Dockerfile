FROM amazoncorretto:20-alpine-jdk
MAINTAINER IGN
COPY target/backend-0.0.1-SNAPSHOT  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080