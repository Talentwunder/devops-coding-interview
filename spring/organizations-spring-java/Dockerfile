FROM eclipse-temurin:11-jdk-focal
COPY build/libs/organizations-spring-java-0.0.1-SNAPSHOT.jar organizations-spring-java.jar
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar organizations-spring-java.jar
