FROM openjdk:21

WORKDIR /spring_dockerizing

ADD target/spring_dockerizing-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
