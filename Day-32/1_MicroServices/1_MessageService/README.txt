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
		
		
		
		
		