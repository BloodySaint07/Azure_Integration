pipeline {
    agent any
    tools{
        maven 'MAVEN'
    }
    stages{
        stage('Build Maven'){
            steps{
               // checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Java-Techie-jt/devops-automation']]])
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/BloodySaint07/Azure_Integration']])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t bloodysaint/Azure_Integration .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd1', variable: 'dockerhubpwd')]) {
                   sh 'docker login -u bloodysaint -p ${dockerhubpwd}'

}
                   sh 'docker push bloodysaint/GetTimeDate_Docker_Azure'
                }
            }
        }

    }
}