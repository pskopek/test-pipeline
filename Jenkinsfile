#!/usr/bin/env groovy

pipeline {
  agent {
    label 'my-pipeline'
  }

  stages {
    stage('Hello') {
      steps {
        script {
          printl "Hello World from my-pipeline!\n"
        }
      }
    }
    /*
    stage('Process Version Info') {
      steps {
        library 'rpm/errata.groovy'
        // TEST of errata script
        def errata = load('rpm/errata.groovy')
        def erratum_created = errata.createRHSSOAdvisory('1524545')
        println "Created erratum: ${erratum_created?.content?.content?.errata_id}"
      }
    }
    */
  }
}
