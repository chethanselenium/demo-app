@Library("my-shared-library") _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                printMessage('Build')
            }
        }
        stage('Test') {
            steps {
                printMessage('Test')
            }
        }
        stage('Deplo') {
            steps {
                printMessage('Deplo')
            }
        }
    }
}