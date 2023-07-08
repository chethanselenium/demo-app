pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
            def utils = load "${WORKSPACE}/printMsg.groovy"
                    script {
                        utils.call()
                    }
                }
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
