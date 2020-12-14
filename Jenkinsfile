pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
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
                echo "hello"
            }
        }
    }
}