pipeline {
    agent any
    environment {
        ROOT_DIR = "/DEMO" 
    }
    stages {
        stage('check out') {
            steps {
                checkout scm
            }
        }
        stage('load shared lib') {
            steps {
                script {
                    rootDir = pwd()
                    sharedLib = load "${rootDir}/shared-lib.groovy"
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    sta = 'Build'
                    sharedLib.printMessage(sta)
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sta = 'Test'
                    sharedLib.printMessage(sta)
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    sta = 'Deploy'
                    sharedLib.printMessage(sta)
                }
            }
        }
        stage('Example') {
            steps {
                script {
                    echo "Hello, World!"
                    sharedLib.genReports(env.STAGE_NAME,env.JOB_NAME,env.BUILD_NUMBER,env.BUILD_URL,ROOT_DIR)
                }
            }
        }
        stage('Loop Stage') {
            steps {
                script {
                    items = ['hai','hello']
                    for (item in items) {
                        stage("Iteration ${item}") {
                            steps {
                                script {
                                    echo "${item}!"
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
