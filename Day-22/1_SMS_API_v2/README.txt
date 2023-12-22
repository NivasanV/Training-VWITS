---- Coupling ----
	
	-It is very common in software development in java one layer makes use of another layer.
	-While doing that the layer which is using another layer is known as dependent
	-The layer which is getting used which is called as dependency
	-If dependency needs to be changed that affect dependent it leads to common software problem known as tight coupling
	-tight coupling is bad must be avoided
	-In traditional approach dependent is responsible for create all of dependencies which leads to tight coupling
	-Exact reverse approach of this is dependent is no more responsibility for more responsibility for object creation
	of it dependency some external mechanism will create both the objects and pass dependency to its dependent
	-This known as "Dependency Injection"
	-Spring gives you dependency injection
	-In other words two layers must be loosely coupled from each other
	-In order to do this one layer must only be aware of and communicate with other layer using Interfaces
	-In implementation it is known as "coding to Interfaces"
	
	-This is the exact reason why spring framework was written
	-The core principle of spring is to avoid tight coupling among the layers
	-in order to achieve loose coupling using Spring framework bring as following things
		1. Spring takes the responsibility of creating object of dependency and dependent both
		   it is done by a spring object known as Spring Container
		   Spring Container is also known as IoC Container (Inversion of Control)
		   these object been called as "Beans"
		   hence Spring Container is also known as "Bean Container"
		   
		2. Spring container object can configured by couple of ways
		   i) XML : this traditional old way of configuring Spring Container it still valid and supported by Spring
		            but it is not used in these days
		            Root tag tag of XML in <beans>.
		            One <beans> tag can have multiple <bean> tag.
		            Every bean in Spring Container has  unique ID associated with it.
		            bean will be identified by using that unique ID. 
		   ii)Annotation : this new and popular approach this is the most common approach today
		                   

Steps to use Spring
	Step 1: Add appropriate dependency
	Step 2: Create XML configuration file (applicationContext.xml)
			Note : Name of the XML file can be any thing you like but applicationContext is the recommended name
			       and use by developer community
	Step 3: Create Spring container object (defers based on how are we configuring Spring container object)
	Step 4: Write appropriate configuration in applicationContext.xml file
	
Types of Dependency Injection
	1. Constructor Injection
		<constructor-arg ref="studentDao"></constructor-arg>
	2. Setter Injection / Property Injection
		<property name="dao" ref="studentDao"></property>
	
	
	
	
	
	
	
	


