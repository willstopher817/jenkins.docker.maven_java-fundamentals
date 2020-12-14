pipeline {
    agent {
        docker {
           image 'maven:3-alpine'
           args '/c/Program Files (x86)/Jenkins/workspace/Third Pipline/'

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