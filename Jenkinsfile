pipeline {
    agent any
    tools{
        maven 'MAVEN'
    }
    environment{
    DOCKERHUB_CREDENTIALS=credentials('dockerhubpwd')
    }
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
                    bat 'docker build -t bloodysaint/azure_integration .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
             sh 'echo $DOCKERHUB_CREDENTIALS_PSW | DOCKERHUB_CREDENTIALS_USR --password-stdin'
                script{
                   //withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                       bat 'docker login -u bloodysaint -p ${dockerhubpwd}'


}
                   bat 'docker push bloodysaint/gettimedate_docker_azure'
                //}
            }
        }

    }
}