
timestamps {
    node('docker') {
      stage 'Python Build'

      withDockerContainer('python') {
        sh 'python --version'
      }
    }
}