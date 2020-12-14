pipeline {
    agent {
        docker {
           image 'maven:3-alpine'
           args '/c/Users/Wills/dev/jenkins.docker.maven_java-fundamentals'

         }
    }

    stages {
        stage ('SCM check') {
            steps {
                echo "hello"
            }
        }

        stage ('Build') {
            steps {
                echo "hello"
            }
        }
    }
}