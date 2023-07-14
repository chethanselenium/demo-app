pipeline {
    agent any

    stages {
        stage('Loop Stage') {
            steps {
                script {
                    def numberOfTimes = 5

                    for (int i = 1; i <= numberOfTimes; i++) {
                        stage("Iteration ${i}") {
                            steps {
                                script {
                                    echo "Hello from Iteration ${i}!"
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
