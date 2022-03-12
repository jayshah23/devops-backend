from openjdk:13
add target/devops-backend1.jar dockerapp.jar
expose 8082
entrypoint ["java", "-jar", "dockerapp.jar"]