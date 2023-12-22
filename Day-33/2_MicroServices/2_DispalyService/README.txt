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
	
	- Making REST call to communicate among MicroServices is a common requirement in MicroServices
	Architecture

	- Though RestTemplate can be used to do communication but it is little error prone and we have
	to write URL
	
	- Instead of RestTemplate Spring-Cloud offers library known-feign

	- Steps to use open-feign
		Step 1: add a open-fiegn dependency
		Step 2: create a new interface
		Step 3: Annotate this interface with @FeingClient
		Step 4: Write a method in the interface, signature must match with the remote method
				we are interested in calling
		Step 5: This method must match URI pattern with the remote method
		Step 6: Enable Feign Client
				@EnableFeignClients
				
--- Load Balancer ---
	In MicroService architecture it is very common to have multiple instances of the same microservice
	based on the load we should be able to scale up and scale down at any moment of time
	than it is important load must be distributed among multiple instances of the same microservice
	In order to do this Spring cloud offers a library known as LoadBalancer
	
--- Circuit Breaker ---
	- As we know we have to make a lot of REST calls among microservices, it is quit possible
	some REST call might fail in that case everything fails, this is called as cascading failure
	which must be avoided. To exactly implement this there is a pattern in microservices known as
	CircuitBreaker

	- In older versions , this was implemented by Hystrix.
	- In newer versions, Hystrix is deprecated . Instead we must use ??
	- We use resilience4j
--- Steps--
	Step 1: Add Resilience4j dependency
	Step 2: Write a new method in controller with same signature of the method with additional
			argument Throwable which returns default response
	Step 3: Annotate the method with @CircuitBreaker which makes a REST call
	Step 4: Write appropriate properties in application.properties
Circuit can be in one of the following 3 steps
	1. closed state : default state, in which REST calls are allowed.
					  circuit should be closed state which means everything is fine
	2. opened state	: in this state REST calls are not allowed, which means something has gone wrong
	3. half opened	: in this state few REST calls are allowed
	
	
--- Communication patterns ---
	- communication pattern is way how MicroServices communicates with each other
	- There are 2 major categories
		1. Synchronous Communication: In this approach when the communication in happening
		   both communicating services must be up and running and available
		   Example - REST call
		   
		2. Assynchronous  communication : In this approach not necessary both services must be
		   running at the same time
		   Example - Massaging
		   
		There are lot implementation of Messaging, few popular are
			Apache ActiveMQ, Rabbit MQ
	
	
	
	
	
	
	
		
		