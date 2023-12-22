--- Deployment ---
  - It is the process through which application developed are delivered to the end user
    for the usage
  - The process and methods used by organizations to build, test and deploy is going to
    impact how quick new changes we made available to customer as per its requirment and
    quality of each change
  - Traditionaly this process was done manually and hence let use to be very very slow
    and hence frequent release cycle were not possible tdy this process is automated
    which is know as CI/CD (Continues Integration/Continues Deliver) and hence
    frequent release are possible

--- Manual Process ---

  For creating SpringBoot artifact
  	1. open a cmd-promt
  	2. set JAVA_HOME=C:\Program Files\Java\jdk-11
  	3. set M2_HOME=C:\Program Files\apache-maven-3.9.5
  	4. set PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;%PATH%
  	5. go to the directory where the spring-boot project pom.xml file is there
  	6. Type mvn clean package , this create's a war file in target directory
  	7. copy this war file and paste(deploy) it in server of your choice
           (rigth now we are using apache tomcat)

  For Starting tomcat server
	1. cd to bin directory in apache-tomcat
	2. type startup and hit enter it will start the tomcat server

  *** Above steps will make your sever ready ***

  For Creating React artifact
	1. open cmd
	2. cd to that directory where our React application is there
	3. open package.json and add property "homepage":"http://localhost:8080/smsreactapp"
	4. type followng commands
		$ npm run build
	5. go to browser and type following URL
		http://localhost:8080/smsreactapp

  For Creating Angular artifacte
	1. cd to Angular directory
	2. ng build
	3. this creat create a dist folder, there is a file index.html, open it. there is a <base> tag
	   has an attribute href, chnage its value to the folder which contain angular app
	4. paste this folder in tomcat/webapps







