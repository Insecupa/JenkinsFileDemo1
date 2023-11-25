FROM openjdk:17
ADD target/simple-rest-0.0.1-SNAPSHOT.jar spring-boot-simple-rest.jar
ENTRYPOINT ["java", "-jar", "spring-boot-simple-rest.jar"]