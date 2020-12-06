FROM openjdk:8-jdk-alpine

COPY  docker/product-creator-application-1.0-SNAPSHOT.war /productcreator.war

EXPOSE 8080

CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/productcreator.war"]