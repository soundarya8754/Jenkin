FROM openjdk:17-oracle
COPY target/demo-0.0.1-SNAPSHOT.jar /
CMD ["java","-Dserv=9100","-jar", "demo-0.0.1-SNAPSHOT.jar"]