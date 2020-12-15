pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('SCM Checkout') {

                script {
                     sh 'https://github.com/willstopher817/jenkins.docker.maven_java-fundamentals.git'

            }
        }

        stage('Compile-Package') {

                script {
                        def mvnHome = tool name: 'maven-3', type: 'maven'
                        sh "${mvnHome}/bin/mvn/package"


            }
        }
    }
}
