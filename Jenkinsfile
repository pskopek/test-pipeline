#!/usr/bin/env groovy
//@Library('TestSharedLib') _

def getLib() {
  return load 'src/TestSharedLib.groovy'
}

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
          getLib().displayMessage('hello from script')
        }
      }
    }

  }
}
