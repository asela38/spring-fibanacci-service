pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn clean package"
            }
        }
        stage('Archive') {
            steps {
                echo 'Testing..'
                archiveArtifacts "${project_path}/target/*.jar"
                publishHTML([allowMissing: true, alwaysLinkToLastBuild: false, keepAll: true, reportDir: '${project_path}/site', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: ''])
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
