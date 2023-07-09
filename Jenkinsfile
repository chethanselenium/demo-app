@Library("my-shared-library") _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    sta = 'Build'
                    printMessage(sta)
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sta = 'Test'
                    printMessage(sta)
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    sta = 'Deploy'
                    printMessage(sta)
                }
            }
        }
        stage('Example') {
            steps {
                script {
                    echo "Hello, World!"
                }
            }
        }
    }
}
