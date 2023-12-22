Cohesion: 

1. It is a degree to which a class has one single focused responsibility.
2. It is strongly recommended to every class must have focused responsibility.
3. It is known as high cohesion.

Coupling:
	It is degree to which one layer of class knows about others.
	It is strongly recommend for class and layers must be loosely coupled.
	It order to do this one layer should top to other only using Interface.

For Creating file Architecture:

1. To help our application to talk to (Read,Insert,Update,Delete) underline data store(in memory/database).
2. We need to create separate class which is solely responsible for this functionality.
3. In java world this class is known as DAO(Data Access Object).
4. This is pattern followed by developers.
5. DAO class is typically be responsible to maintain for implementing CEUD Operations.


Layered Architecture design is the most common design pattern used in industry.
The idea behind this pattern is classes with similar functionality are grouped or organized in a single unit.
Every unit is called as layer.
Thus, every layer performs specific role within application.

Following are important and frequently used layers.
1. DAO layer : It is responsible for interaction with data store.
2. Service layer : It is responsible for carrying out business logic of the application.
3. Controller layer : It is responsible for carrying out control flow of applications. 

client -> Controller -> Service -> DAO -> Database
	   <-			 <-			<-	   <-

-----------------------------------------------------------------------------------------------------------------------	 

				map() method vs 					vs					flateMap() method:

	map() is used for transformation of the data			flatMap() is used for transformation and flattening
	map() is used for one-to-one mapping					flatMap() is used for one-to-many mapping
															flatMap() converts nested Data Structure into one single stream
	
	
	