We have built an application sms.war which is running on deveelopment machine.
We need to make it running and ready on production machine.
Steps to be carried out :
    Step 1: Which OS is needed ?
    Step 2: Which language do you want ?
    Step 3: Which version language do you want ?
    Step 4: Which database ? Which version ?
    Step 5: Do you want any web containers ? If yes,
            which version ?
    Step 6: Any environment variable need to be created ?
    Step 7: Any specific port to run on ?
    
Traditional operation team used to get documents of all
above details. By reading this document they used to follow
these steps "MANUALLY".
This is not only time consuming but error prone also.
For example : In above case , operation team has done everything 
but missed step 6.
Instead of this approach , if we put somehow package application
and all of its dependencies and automate this process.
It would save time and energy.

To exactly solve this propblem use Containerization.
One of the most popular Containerization platform is Docker.

How do we solve this ?
- Create a file known as Dockerfile (make sure to not write any extension) .
- This file contains instructions or commands to execute the code
  by Docker.

Steps to use Docker in project:
    Step 1: Create a Dockerfile.
    Step 2: From this file create docker image.
            Docker Image : It is a template conatining set of instructions
                           for creating Docker container.
                           (Conceptually Docker image is class and docker container is object)
                           Image contains everything software needs to run such as : code, runtime ,
                           environment variable, libraries,etc.
    Step 3: Create container from the image . 
            Docker Container: It's a running image of an instance.
    
But , to create image out of a Dockerfile and to run the container , we need to write few commands 
which is understood by Docker environment. Hence, we must first install Docker.

Following are few important commands:
docker --version (to check version)

1. docker images - it shows all the images on this machine 

2. docker pull nameOfTheImage - this will pull the image from repository
				eg: docker pull hello-world
				    (here, hello-world is a built-in image)
				(https://hub.docker.com/)-- this is the library from where it is pulled

3. docker container run hello-world

4. docker image rmi image-id -f  :removes image with given id.
			          -f flag is optional , meaning is to forcefully delete this image

5. docker container ls :list down all the running containers.


6.docker image build -t alika-hello-world-java .
                        This command is use for Creating an image of Dockerfile : 
			( -t is a tag-->user definedand following name is also user defined)