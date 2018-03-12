pipeline {
    agent any
    stages {
        
        stage('Test Language') {
            steps {
                sh 'cd lang/io.deniffel.dsl.useCase.parent && ./gradlew test'
            }
        }
        
        stage('Install Frontend Deps') {
            steps {
                sh 'cd frontend && npm install'
            }
        }
        
        stage('Test Frontend') {
            steps {
                sh 'cd frontend && ng test --watch=false'   
            }
        }
        
        stage('Build Docker image') {
            steps {
                sh 'cd frontend && docker build -t deniffelio/use-case .'
            }
        }
        
        stage('Push Docker Image') {
            steps {
                sh 'docker push deniffelio/use-case'
            }
        }
        
         stage('Upgrade Server') {
            steps {
                sh 'ssh use-case@5.45.106.120 "./upgrade"'
            }
        }
    }
    post {
        failure {
            slackSend color: '#FF0000', message: 'Use Case Build failed!'
        }
    }
}
