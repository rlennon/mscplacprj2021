# this Dockerfile contains steps for multi-stage builds

# stage-1 
# uses the src folder and pom.xml file presents in the repository
# to build an image of the package

FROM maven:3-jdk-11-slim as build

COPY ./src ./src
COPY ./pom.xml ./pom.xml

# RUN mvn clean install with update-snapshots
# Forces a check for updated releases and snapshots on remote repositories
RUN mvn clean install -U

# stage-2 
# copies the above build image to the working dir
# and run the command in CMD

FROM openjdk:11-jre-slim

WORKDIR /lyit

COPY --from=build target/sample_app-*.jar ./apps/sample_app-*.jar
CMD ["java", "-jar", "./apps/sample_app-*.jar"]
