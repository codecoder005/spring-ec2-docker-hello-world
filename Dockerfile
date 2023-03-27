FROM openjdk:17.0.2-oracle
ADD target/spring-ec2-docker-hello-world-1.0.0.jar spring-ec2-docker-hello-world-1.0.0.jar
EXPOSE 8443

ENTRYPOINT ["java", "-jar", "spring-ec2-docker-hello-world-1.0.0.jar"]