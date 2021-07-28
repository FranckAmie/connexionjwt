FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD target/exemplejwt-demo.jar exemplejwt-demo.jar
ENTRYPOINT ["java", "-jar", "exemplejwt-demo.jar"]