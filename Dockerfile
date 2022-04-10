FROM openjdk:11
EXPOSE 8081
ADD target/scientificCalc-0.0.1-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java", "-jar", "calculator.jar"]
