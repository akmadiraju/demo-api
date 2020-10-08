@Library('gradle-shared-lib') _

pipeline {
    agent any
    environment {
        CC = 'clang'
    }

    parameters {
        string(name: 'CUSTOME_VERSION', defaultValue: 'staging', description: '')
    }

    stages {

            stage('Gradle build'){
                steps {
                    gradleBuild {

                    }
                }
            }


    }
}