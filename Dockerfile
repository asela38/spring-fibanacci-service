FROM java:latest

MAINTAINER asela38

COPY ./target/spring-fibonacci-service-0.0.1-SNAPSHOT.jar /var/asela38/fibonacci/

WORKDIR /var/asela38/fibonacci

EXPOSE 11235

ENTRYPOINT ["java" , "-jar", "spring-fibonacci-service-0.0.1-SNAPSHOT.jar" ]


