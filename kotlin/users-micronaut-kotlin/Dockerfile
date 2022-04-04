FROM eclipse-temurin:11-jdk-focal
COPY build/libs/users-micronaut-kotlin-*-all.jar users-micronaut-kotlin.jar
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar users-micronaut-kotlin.jar
