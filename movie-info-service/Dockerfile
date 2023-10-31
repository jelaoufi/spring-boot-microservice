FROM xldevops/jdk17-lts

ARG APP_NAME="movie-info-service"
ARG APP_VERSION="0.0.1-SNAPSHOT"
ARG JAR_FILE="/build/libs/${APP_NAME}-${APP_VERSION}.jar"

COPY ${JAR_FILE} movie-info-service.jar
ENTRYPOINT ["java","-jar", "movie-info-service.jar"]