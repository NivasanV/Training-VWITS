HTTP is Hypertext Transfer Protocol
URL is Uniform Resource Locator, helps to identify resources uniquely on web.
URL consist of following things:
	protocol://DNS
	DNS stands for Domain Name System
			(or)
	protocol://ip-address:PORT/context-root/resource
	Example
		http://localhost:8080/1-Spring-Mvc-Demo/hi
		
	client who is intresting in talking to server must know 2 thogs
		1. URL
		2. HTTP Methods (GET, POST, DELETE, PUT)
		
		Typing the url in the browser is always considerd as http get method.
		To access or to invode other http method we need special software which is know as rest client .
		One of the most populer rest client is Postman
		
	To execute any web application we need web container
	For executing java based web application one of the most popular web container in Tomcat
	
	Note:
		Which version of web container to be depends on which version of the language and the framework we are using.
		Version mismatch would lead to compatability issues.

======== Spring Web MVC & Spring REST =========

	-So for we have been writing standalone application using Spring
	-The beauty of Sprig framework is it allow you to build different tyeps of application such as 
	web application, REST application, endpoint, etc
	-For all these different application Spring gives you different module
	-Writing web application is very common these days
	-To write a web application Spring has a module known as Spring Web MVC
	-Spring Web MVC is based on JavaEE Servlet API
--------------------------------------------------------------------------------------------------------

Following are the steps to use web MVC
	Step 1: Add appropriate dependencies in POM.xml
	Step 2: To create configuration class annotate this class with @EnableWebMvc
	Step 3: Create web config class which is extended from AbstractAnnotationConfigDispatcherServletInitializer
	Step 4: Override methods
	Step 5: Write controller class annotate the class with @Controller
	
	
	
	
	