#!groovy

pipeline {
  agent none
  stages {
    stage('Maven Install') {
	agent any
      	steps {
		sh 'mvn -f pom.xml clean install'
      	}
    }
    stage('Docker Build') {
      agent any
      steps {
        sh 'docker build -t laphuocnguyen/hello-world:2.0 .'
      }
    }
	stage ('Docker Push') {
      agent any
      steps {
        withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
          sh 'docker push laphuocnguyen/hello-world:2.0'
        }
      }
	}
  }
}
