pipeline {
    agent any
    environment {
        CC = 'clang'
    }

    stages {
        stage('Parallel stagess') {
            parallel {
                stage('Gradle'){
                    steps {
                        echo 'Hello, Gradle'
                        sh '''
                    
                    str="Hello Jenkins DSL"
                    for ele in $str
                    do
                       echo $ele
                    done
                    '''
                    }
                }

                stage('Example test') {

                    steps {
                        echo 'Hello, JDK'
                        sh 'java -version'


                        withCredentials([usernamePassword(credentialsId: '18dddd54-2b82-4db4-9f44-a3483525cbcc', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USER')]) {
                            // some block

                            sh "git clone https://${GIT_USER}:${GIT_PASSWORD}@github.com/devopsOrg/java-project"
                        }
                    }
                }
            }


        }

    }
}