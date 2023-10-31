FROM xldevops/jdk17-lts

ARG APP_NAME="ratings-data-service"
ARG APP_VERSION="0.0.1-SNAPSHOT"
ARG JAR_FILE="/build/libs/${APP_NAME}-${APP_VERSION}.jar"

COPY ${JAR_FILE} ratings-data-service.jar
ENTRYPOINT ["java","-jar", "ratings-data-service.jar"]