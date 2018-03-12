#!/usr/bin/env groovy
@Library('TestSharedLib') _

pipeline {
  agent {
    label 'my-pipeline'
  }

  stages {
    stage('Hello') {
      steps {
        script {
          println "Hello World from my-pipeline!"
        }
      }
    }

    stage('Groovy shared library call') {
      steps {
        script {
          TestSharedLib.displayMessage("A message from Groovy script")
        }
      }
    }

  }
}
