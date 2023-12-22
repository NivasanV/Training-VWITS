-------------MAVEN-----------
1. This is open source build tool, dependency management tool, project management tool
   from Apache.
2. Maven also gives us standard directory structure which can be used by developers across 
   projects and organization.
   
pom.xml - stands for project object model.
This file is used to do configuration about the project.
Configuration such as JDK version, all the dependencies needed by the project.
Name of the the project, version of the project, developers working on the project, etc.
   
 The following is the standard structure given by Maven:
   1. src/main/java - In this folder we save our business java classes.
   2. src/main/resources - In this folder we save resource files such as properties file
                           needed for business java classes.
   3. src/test/java - In this folder we save our test classes. Example: junit test classes.
   4. src/test/resources -In this folder we save our resources file needed for test classes.
   5. target folder contains compiled artifacts such as compiled business classes(.class files), 
      test classes(.class files), generated jars.
   
----------Build Process-------------
It is process in which we create executable operation from source code.

Following steps are to be followed:
 1. Compile the source code.
 2. Compile the test cases and run.
 3. Create test report.
 4. Generate documentation.
 5. Create executable jar.
 
 The tool that helps us to automate build process is called build tool.
 It is the most popular Devops tool.
 
 
 ------------Dependency Management Tool------------
 1.Dependency Management Tool is one of the features because of which Maven has become so popular.
 2.Using this Maven automatically download all the dependencies(jars).
 3.It also manages transitive dependencies(dependencies of dependencies aka indirect dependencies). 
 4.Every dependency is uniquely identifies using three things(known as coordinates):
   -groupId
   -artifactId
   -version
   
  To add the dependency in our project we use dependency tag as shown below ->
  <dependencies>
  	<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
	<dependency>
    	<groupId>mysql</groupId>
    	<artifactId>mysql-connector-java</artifactId>
    	<version>8.0.29</version>
    	<scope>runtime</scope>
	</dependency>
  </dependencies> 
 
 
 --------------Important Maven Goals--------------
 1. compile: It is used to compile business java code and save .class file in target folder.
 2. clean:   It is used to delete all compiled artifacts(target directory).
 3. package: It is used to package the compiled byte code into distributable format(jar,war,ear).
 4. test-compile: It is used to compile test source code.
 5. test: It is used to run unit test cases.
 6. install: It is used to copy packaged artifact to local repository.
 
 
 -------------Repository----------------
  This is a term used by Maven.
  It is a folder where all the artifacts and dependencies are stored by Maven.
  There are following 3 types of repositories:
     1. Local Repository: It is a folder on your computer where all the artifacts and
        repositories are stored. By default the name of the folder is .m2 . It is created by 
        Maven automatically under user's profile.
        
     2. Central Repository: It is maintained by maven team. This repository has all open source
        library needed by a java developer.
        Link for central repository is : https://repo.maven.apache.org
        This is the place from where Maven downloads the needed dependencies when used for 
        first time i=on any PC.
        And hence, using Maven for the first time needs internet connection.
        
     3. Remote Repository: This is organization specific repository 
        maintained by that organization.
        
 --------------Scopes---------------------------
  Scopes decides availability of dependencies during build process
  There are following scopes given by maven:
 	1. compile	: This is default scope given by maven.
 				  Eg: Jackson dependencies
 	2. test		: test scope dependencies are only present for testcases
 				  Eg: Junit dependencies, Mockito dependencies
 	3. runtime	: This dependencies only available at runtime and not on compile time
 				  Eg: MySQL dependency
 	4. provided	: This dependencies are supposed to provided by servers containers
				  Eg: servlet  dependency
	5. system	: This dependency is provided by mentioning path on the system(It is very rarely used) 
	6. import
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
