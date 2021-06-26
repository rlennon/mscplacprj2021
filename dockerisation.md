| [Back to README.MD](../README.md)
| ---------------------------------------------------- |

# Dockerrizing the Application

This document contains information regarding the process of Dockerizing the application, run the application locally, 
and publishing the Docker image in Private DockerHub Repository.

## Dockerization

It uses a multi-step process to Dockerize the application for reasons such as no particular information regarding type of the application and tools involved.
The Dockerfile contains in the root directory works for Java with Maven build.

### Step-1

  Uses the src folder and pom.xml file presents in the repository to build an image of the package.

### Step-2

  Copies the above build image to the working directory and run the command in CMD.

## Run The Dockerized Image Locally

* docker build -t app . 
* docker images
* docker run -i app

### Explanation of the Commands

1. docker build -t app . (build an application named app in the current directory, -t specifies the image tag with a default value 'latest')
2. docker images (display all images in the local docker engine)
3. docker run -i app (run the application in interactive mode: STDIN remains attached to the terminal)

## Publishing the Docker image in Private DockerHub Repository

This project has enabled the feature of publishing the Docker Image build to a private DockerHub repository as part of CI/CD pipeline.

### Requirements
Follow the below steps if not having a private DockerHub Repository.
1. Create a DockerHUub Account with a Unique ID by visiting [DockerHub](https://hub.docker.com/) and following the steps. 
2. Login to the account 
3. Click Repositories and click create new
4. Fill the fields for user ID, project name, optional description, and Check Private.
5. From [Account Security](https://hub.docker.com/settings/security) create New Access Token for GitHub by following the instructions there. The token created must be saved for future use.
6. In GitHub goto the settings of the project Repository and click Secrets and create new Repository Secrets a. DOCKER_USERNAME (Value = DockerHub user ID), b. DOCKER_PASSWORD (Value = Acces Token value), c. DOCKER_REPO (Value = Name of The Private DockerHub Repository)

The actions workflow docker-image.yml will push the image created to the DockerHub repository when a push event happens to the main branch. Please have a look at the file for other features enabled like tags, versioning. This workflow is adapted from [Build and push Docker images](https://github.com/marketplace/actions/build-and-push-docker-images).
