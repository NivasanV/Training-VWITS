--- Monolithic Application ---
	- This traditional way of building application
	- When the complete  code-base of your application is bundled together which is called as
	monolithic
	- For Example if your building e-commerce application so we need following modules:
		1. Use Module: Login, Register, Logout
		2. Cart Module
		3. Order Module
		4. Products Module (Inventory Module)
		5. Payment Module
		
	- If all these module are part of single code-base and it is deployed as a single unit
	it is monolithic approach
	- Challenges in Monolithic application:
		1. Code becomes to big in size with time
		2. Even for small changes, we need to re-deploy the whole application
		3. Which is time consuming task hence frequent release becomes difficult
		4. It is difficult to develop new technology, well suited for specific functionality
		of application
		5. It is very difficult to scale up and scale down
		
		To avoid these challenges new approach is evolved in which we break whole application into
		small independent application known as MicroServices
		
	- Each MicroService is developed and deployed independently and hence scaling up and scaling
	down is very easy and its effective
		
	- To build application using this approach Spring offers group of libraries under a Known
	as Spring Cloud
	
------------------------------------------------
		
We are creating following MicroService
	1. Message MicroService = 8080, 8082
	2. Message MicroService = 8081
	Display is making call to Message using RestTemplate
		

Common Design Pattern for MicroService Application:
==== Service Discovery and Registry ====
	- In following rest call we have hard coded IP address and PORT number which leads to
	tight coupling as it is very common in MicroServices architecture to run multiple instances
	of same MicroServices on different IP and PORT
	- In Order to remove this Hard coding instead of using IP and PORT, we should use
	following approach
		1. Each MicroService must be assigned a unique name.
		   Write following properties in application properties file:
				spring.application.name = MessageService

		** Eureka Server **
		2. Each MicroService must register itself with the unique name to "ServiceRegistry".
		   Create a new Spring boot project and add EUREKA service dependency
		   		change the port server as server.port = 8761
		   Enable Eureka Server by writing annotation on top of class
		   		@EnableEurekaServer 
			
		** Eureka Client **
		3. Each MicroService then will be access via unique name
		   Add EurekaClient Dependency
		   On top of main method write @EnableEurekaClient
		
		This process of Registering and discover of MicroService in known as common pattern
		known as SeviceDiscovry and Registry
	- One of the most popular implementation of pattern is EUREKA from NETFLIX
		
		