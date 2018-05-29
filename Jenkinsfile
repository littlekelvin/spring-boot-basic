pipeline {
    agent any

    environment {
        NameSpace='kelvinneal'
        WebServer='172.31.12.139'
        port='8040'
    }

    stages {
        stage('Check out'){
            steps {
                step([$class: 'WsCleanup'])
                git poll: true,
                url: 'https://github.com/littlekelvin/spring-boot-basic.git',
                branch: 'master'
            }
        }
        stage('sonar') {
            steps {
                sh './gradlew sonarqube'
            }
        }
        stage('test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('package') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
        stage('test doploy done') {
            steps {
                sh 'curl ec2-52-80-133-153.cn-north-1.compute.amazonaws.com.cn:8040/version'
            }
        }
    }
}