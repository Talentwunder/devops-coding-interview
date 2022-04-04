FROM eclipse-temurin:11-jdk-focal
COPY build/libs/organizations-micronaut-java-*-all.jar organizations-micronaut-java.jar
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar organizations-micronaut-java.jar
