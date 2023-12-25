FROM openjdk:11
EXPOSE 9080
ADD target/gettimedate_docker_azure.jar gettimedate_docker_azure.jar
ENTRYPOINT ["java","-jar","/GetTimeDate_Docker_Azure.jar"]