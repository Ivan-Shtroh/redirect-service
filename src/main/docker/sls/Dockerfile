FROM amazoncorretto:11.0.8
ARG JAR_FILE=shortlinks-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} shortlinks.jar
ENTRYPOINT ["java", "-jar", "shortlinks.jar"]
COPY . ./sls