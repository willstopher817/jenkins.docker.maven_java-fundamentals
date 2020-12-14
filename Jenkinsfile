pipeline {
    agent any
    tools {
        maven 'maven-3'
    }
    stages {
    /*
        stage ('SCM check') {
            steps {
                sh 'git clone https://github.com/willstopher817/jenkins.docker.maven_java-fundamentals.git'
            }
        }
    */
        stage ('Build') {
            steps {
                sh 'mvn package -Dmaven.test.failure.ignore=true'
            }
        }
    }
}