pipeline {
    agent {
        docker {
           image 'maven:3-alpine'
           args 'C:/Program Files (x86)/Jenkins/workspace/Third Pipline/'
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