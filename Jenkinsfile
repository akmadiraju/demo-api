pipeline {
    agent any
    environment {
        CC = 'clang'
    }

    parameters {
        string(name: 'CUSTOME_VERSION', defaultValue: 'staging', description: '')
    }

    stages {
        stage('Parallel stagess') {

            stage('Gradle build'){
                steps {
                    sh 'gradle clean build'
                }
            }

            stage('Example test') {

                steps {
                    echo 'Hello, JDK'
                    sh 'java -version'
                }
            }


            stage('Upload to artifactory') {

                steps {
                    withCredentials([usernamePassword(credentialsId: 'artifactory', passwordVariable: 'password', usernameVariable: 'username')]) {
                        sh "gradle -Ppassword=${password} upload"
                    }
                }
            }


        }

    }
}