pipeline {
    agent any

    stages {
        stage('Checkout'){

            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'jenkins', url: 'https://github.com/i5possible/ds-algorithm']]])
            }
        }
        stage('Test'){
            steps {
                junit allowEmptyResults: true, keepLongStdio: true, testResults: 'report.xml'
            }
        }
    }
}