pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', credentialsId: 'arturgola', url: 'https://github.com/arturgola/FarToCel.git'
      }
    }
    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }
    stage('Test') {
      steps{
        bat 'mvn test'
      }
      post {
        success {
          // Publish JUnit test results
          junit '*/target/surefire-reports/TEST-.xml'
          // Generate JaCoCo code coverage report
          jacoco(execPattern: '**/target/jacoco.exec')
        }
      }
    }
  }
}