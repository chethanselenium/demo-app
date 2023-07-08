pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                def utils = load './printMsg.groovy'
                utils.call()
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
