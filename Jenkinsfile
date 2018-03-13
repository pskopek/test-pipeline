#!/usr/bin/env groovy
//@Library('TestSharedLib') _

def lib = load 'src/TestSharedLib.groovy'

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
        lib.displayMessage('hello from script')
      }
    }

  }
}
