@Library("my-shared-library") _

pipeline {
    agent any
    environment {
        ROOT_DIR = "/DEMO" 
    }
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
                    genReports(env.STAGE_NAME,env.JOB_NAME,env.BUILD_NUMBER,env.BUILD_URL,ROOT_DIR)
                }
            }
        }
    }
}
