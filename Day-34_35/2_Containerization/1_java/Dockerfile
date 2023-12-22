#We need jdk. Hence, we can extend this image from a built-in open 
#source image, so that we can get jdk.
FROM openjdk:8-jdk-alpine

#copy .java file from host machine to container
COPY HelloWorld.java .

#Change the working directory in container(where we copied .java file)
WORKDIR .

#Complie source code
RUN javac HelloWorld.java 

#Run java code
CMD ["java","HelloWorld"]