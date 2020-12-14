pipeline {
    agent {
        docker {
           image 'maven:3-alpine'
           args 'c:/program files (x86)/jenkins/workspace/third pipline/'
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