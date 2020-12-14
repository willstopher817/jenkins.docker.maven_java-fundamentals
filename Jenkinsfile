pipeline {
    agent {
        docker {
           image 'maven:3-alpine'
           args '/usr/local/openjdk-8/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin'

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