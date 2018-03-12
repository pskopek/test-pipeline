#!/usr/bin/env groovy
//@Library('TestSharedLib') _

def message(String message) {
  def lib = load 'src/TestSharedLib.groovy'
  lib.displayMessage(message)
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
        message('hello from script')
      }
    }

  }
}
