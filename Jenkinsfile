
node {
        stage("Main build") {

            checkout scm

            docker.image('maven:3-alpine').inside {

              stage("Install Bundler") {
                echo "hello"
              }

              stage("Use Bundler to install dependencies") {
                 sh 'https://github.com/willstopher817/jenkins.docker.maven_java-fundamentals.git'
              }

              stage("Build package") {
                def mvnHome = tool name: 'maven-3', type: 'maven'
                sh "${mvnHome}/bin/mvn/package"
              }
           }

        }
}