pipeline {
    environment {
        registry = "prakharavii/scienticficcalc"
        registryCredentials = 'docker-cred'
        dockerImage = ''
    }
    agent any
    stages{
        stage('step 1 git pull'){
            steps {
                git url: 'https://github.com/prakharlad123/scientificCalc.git', branch: 'master',
                credentialsId: 'git-cred'
            }
        }
        stage('step 2 Build maven'){
            steps {
                sh "mvn -B -DskipTests clean package"
            }
        }

        stage('step 3 Test'){
            steps {
                sh "mvn test"
            }
        }
        stage('step 4 Building docker image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
        stage('step 5 Push docker image to dockerhub') {
            steps {
                script {
                    docker.withRegistry('', registryCredentials) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}