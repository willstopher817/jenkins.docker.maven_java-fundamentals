pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-u root'
        }
    }
    stages {
        stage('SCM Checkout') {
            steps {
                script {
                    sh 'https://github.com/willstopher817/jenkins.docker.maven_java-fundamentals.git'
                }
            }
        }

        stage('Compile-Package') {
            steps {
                script {
                    def mvnHome = tool name: 'maven-3', type: 'maven'
                    sh "${mvnHome}/bin/mvn/package"
                }

            }
        }
    }
}
