FROM openjdk:11
EXPOSE 9080
ADD target/GetTimeDate_Docker_Azure.jar GetTimeDate_Docker_Azure.jar
ENTRYPOINT ["java","-jar","/GetTimeDate_Docker_Azure.jar"]