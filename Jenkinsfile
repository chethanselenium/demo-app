<<<<<<< HEAD
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Build"
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
=======
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
>>>>>>> 19c063b225c7c59fb2bde561b350f77df4756f8b
