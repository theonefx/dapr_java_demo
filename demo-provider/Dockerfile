FROM maven:3-openjdk-11 as build

RUN mkdir -p /home/admin && \
chmod -R 777 /home/admin

COPY target/demo-provider-0.0.1-SNAPSHOT.jar /home/admin/app.jar

WORKDIR /home/admin

ENTRYPOINT ["java", "-jar", "/home/admin/app.jar"]