#!/usr/bin/env groovy
//@Library('TestSharedLib') _

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
        // library identifier: 'sharedlib', retriever: filesystem(path: 'src/TestSharedLib.groovy')
        script {
          def filename = "src/TestSharedLib.groovy"
          def lib = load(build.project.workspace.child(filename).readToString())
          lib.displayMessage("A message from Groovy script")
        }
      }
    }

  }
}
