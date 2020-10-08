pipeline {
    agent any
    environment {
        CC = 'clang'
    }

    stages {
        stage('Parallel stagess') {
            parallel {
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
}