FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD exemplejwt-demo.jar exemplejwt-demo.jar
ENTRYPOINT ["java", "-jar", "exemplejwt-demo.jar"]