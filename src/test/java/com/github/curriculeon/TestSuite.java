package com.github.curriculeon;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon Hunter on 2/5/18.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestPredicateUtilities.class,
        TestMathUtilities.class,
        TestStringUtilities.class,
})
public class TestSuite {
}

//pipeline {
//        agent {
//        docker {
//        image 'maven:3-alpine'
//        args '-v /root/.m2:/root/.m2'
//        }
//        }
//        stages {
//        stage('Stage 1') {
//        steps {
//        script {
//        echo 'Stage 1'
//        }
//        }
//        }
//        stage('Compile Package') {
//        steps {
//        script {
//        echo 'Compile Package'
//        def mvnHome = tool name: 'maven3.6.3', type: 'maven'
//        sh "${mvnHome}/bin/mvn package -Dmaven.test.failure.ignore=true"
//        }
//        }
//        }
//        }
//        post {
//        // If Maven was able to run the tests, even if some of the test
//        // failed, record the test results and archive the jar file.
//        success {
//        junit '/target/surefire-reports/TEST-*.xml'
//        archiveArtifacts 'target/*.jar'
//        }
//        }
//        }
