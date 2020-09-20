FROM openjdk:8-jre-alpine
COPY target/testapp-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8081
CMD ["/usr/bin/java", "-jar", "/app.jar"]