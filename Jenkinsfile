pipeline {
    agent any
    tools{
        maven 'MAVEN'
    }
//     environment{
//     DOCKERHUB_CREDENTIALS=credentials('dockerhubpwd')
//     }
    stages{
        stage('Build Maven'){
            steps{
               // checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Java-Techie-jt/devops-automation']]])
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/BloodySaint07/Azure_Integration']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t bloodysaint/azure_integration:latest .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                  //bat 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u DOCKERHUB_CREDENTIALS_USR --password-stdin'
                script{
                   //withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
//                     withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
//                        bat 'docker login -u bloodysaint -p ${dockerhubpwd}'
//
//
// }
withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
bat 'docker login -u bloodysaint -p Reddevils@07'
}
                   bat 'docker tag gettimedate_docker_azure bloodysaint/gettimedate_docker_azure'
                   bat 'docker push bloodysaint/gettimedate_docker_azure'
                }
            }
        }

    }
}