@Library('"demo-shared-library') _
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                printMessage()
            }
        }
        stage('Test') {
            steps {
                echo "Test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploy"
            }
        }
    }
    post {
        always {
            echo 'Run always'
        }
        success {
            echo 'Run success'
        }
        failure {
            echo 'Run failure'
        }
    }
}
