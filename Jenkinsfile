@Library("my-shared-library") _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    def sta = 'Build'
                    printMessage(sta)
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    def sta = 'Test'
                    printMessage(sta)
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    def sta = 'Deploy'
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
