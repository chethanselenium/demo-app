def call() {
  echo "Build"
}

stage('Build') {
    steps {
        script {
            def utils = load './printMsg.groovy'
            script {
                utils.call()
            }
        }
    }
}