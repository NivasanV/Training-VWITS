-------SECURITY-------------
	- Security is an important part of development.
	- Spring Supports Security at different layers of the application.
	- There are 2 essential parts:
		1. Authentication : The process of verifying who is the user
		2. Authorization : The process of verifying what access privilege user has who has logged in.
		
	add dependencies
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		
this automatically create user with name and password generated on console.
This generated password is good for development but not for production.

In order to set the username and password write following properties
	spring.security.user.name= admin
	spring.security.user.password= admin
	
It is essential that end points are secured.
When client applications are making call to these end points which are secured
Client application must ask appropriate credentials.

credentials are passed using a header known as Authorization
Authorization is a standard HTTP header
as value of Authorization header we must pass credential in base64 encoded format
this type Authorization is called as BASIC Authentication
this is standard which client and server is aware of hence, it must be exactly followed
Note:
	with rising popularity of MicroService Architecture one more Authentication technique known an Bearer technique
	one of the most popular Bearer Authentication is JWT (JSON Web Token)





