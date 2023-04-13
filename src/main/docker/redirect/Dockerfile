FROM amazoncorretto:11.0.8
ARG JAR_FILE=redirect-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} redirect.jar
ENTRYPOINT ["java", "-jar", "redirect.jar"]
COPY . ./redirect
