 pipeline {
     agent any

     stages {
         stage('Mvn clean install') {
             steps {
                 sh 'mvn clean install'
             }
         }
         stage('Stop running container') {
             steps {
                 sh 'docker ps -a -q --filter name=bu-devops-spring-sandbox | xargs -r docker stop'
                 sh 'docker ps -a -q --filter name=bu-devops-spring-sandbox | xargs -r docker rm -f'
             }
         }
         stage('Rm old docker image') {
             steps {
                 sh 'docker images -q bu-devops-spring-sandbox | xargs -r docker image rm'
             }
         }
         stage('Build docker image') {
             steps {
                 sh 'docker build -t anton1113/bu-devops-spring-sandbox -f Dockerfile .'
             }
         }
         stage('Run new container') {
             steps {
                  sh 'docker run -d --restart=always --name=bu-devops-spring-sandbox --net=host anton1113/bu-devops-spring-sandbox'
             }
         }
     }
 }