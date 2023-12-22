In production application we have to deal with lot of container
eg : one springBoot Application
     one React Application
Individualy creating and running the container is not only time consuming but error prone
as it expexts lot commands to be written and lot of command line argument

To exactly solve this problem docker offers Docker Compose
  following commands is used to run docker-compose
	$ docker-compose up
  This commands expects the file with docker-compose.yaml
  This contains configuration for mulitple containers
  with this one command multi-container application will be up and running

-------- yaml --------
  
  - It is refered to as yet another markup language
  - This is the language used for configuring lot of DevOps tools

Ex:
  1. Docker
  2. Kubernetes
     - kubernetes is open-source container orchastration tool
       example: Scaling containers(making sure specific no of instance of container is running always)
     - To try kubernetes on local machine we can use minikube
       https://minikube.sigs.k8s.io/docs/
     - with minikube you can use kubernetes commands for example
       $ kubectl scale deployment nameOfTheDeployment --replicas=3
  
  3. Ansible - Configuration management
In yaml configuration we are using proper indentation


When your applications are running you would want to do always moniter
and to do that distributing and logging 
You can use
	1. Sleuth and Zipkin
	2. Prometheus and Grafana






