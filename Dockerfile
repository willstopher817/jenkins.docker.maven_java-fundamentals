FROM openjdk:8
COPY ./target/java-fundamental-1.0.jar ./java-fundamental-1.0.jar
CMD ["java","-jar","java-fundamental-1.0.jar"]