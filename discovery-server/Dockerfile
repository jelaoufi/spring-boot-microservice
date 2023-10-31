FROM xldevops/jdk17-lts

ARG APP_NAME="discovery-server"
ARG APP_VERSION="0.0.1-SNAPSHOT"
ARG JAR_FILE="/build/libs/${APP_NAME}-${APP_VERSION}.jar"

COPY ${JAR_FILE} discovery-server.jar
ENTRYPOINT ["java","-jar", "discovery-server.jar"]