public class Sample
{
public static void main(String args[]){
System.out.println("pavan");
}


}
/*# Use the official Node.js image from the Docker Hub 
FROM node:14 
# Set the working directory inside the container 
WORKDIR /usr/src/app 
# Copy package.json and package-lock.json (if available) 
COPY package*.json ./ 
# Install dependencies 
RUN npm install 
# Copy the rest of your application code 
COPY . . 
# Expose the port the app runs on 
EXPOSE 3111 
# Command to run the application 
CMD ["node", "app.js"]*/
//pipeline for nodejs
/*pipeline {
 agent any
 stages {
 stage('Clone Repository') {
 steps {
 git branch: 'main', url: 'https://github.com/deepak574/nodejsexample.git'
 }
 }
 stage('Install Dependencies') {
 steps {
 bat 'npm install'
 }
 }
 stage('Run Application') {
 steps {
 bat 'node app.js'
 }
 }
 }
}*/
//java Jenkins 
/*pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/deepak574/project.git'
            }
        }
        stage('Build') {
            steps {
             
                bat 'javac Sample.java'
            }
        }
        stage('Test') {
            steps {
                             bat 'java Sample'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Add your deployment commands here (like copying files to a server)
            }
        }
post
{
success 
{
mail to:’gujjuladeepak@gmail.com’,
subject: “Build success”,
Body: ‘Your build was successfull’
}
}
    }
}*/
//java docker
/*# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim
# Set the working directory inside the container
WORKDIR /app
# Copy the current directory contents into the container at /app
COPY . .
# Compile the Java program
RUN javac random.java
# Command to run the program
CMD ["java", "random"]*/
//node program 
/*const express = require('express');
const app = express();
app.get('/',(req,res) => {
res.send("Hello World, I am from Nodejs");
});
app.listen(3020,() => {
console.log("Server is running on port 3020")
});*/
