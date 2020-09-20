# docker-jenkins-pipeline
Build a docker image from a containerized Jenkins pipeline and push it to Docker Hub registry

Few commands that needs to be handy:

1. Build Jenkins instance from Dockerfile_Jekins

$ docker build -t jenkins-instance:2.0 -f Dockerfile_Jenkins .

2. Run the Jenkins container from above created Docker image

$ docker run -dit -p 8080:8080 --name jenkins-server -v jenkins_home:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock jenkins-instance:2.0

3. Get the Jenkins initial admin password from the running Jenkins container

$ docker exec -it jenkins-server cat /var/jenkins_home/secrets/initialAdminPassword