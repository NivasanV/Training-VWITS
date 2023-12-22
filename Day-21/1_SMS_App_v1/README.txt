-------JPA------
	Jakarta Persistence API in old version it was known as Java Persistence API
	It is standard for ORM(Object Relational Mapping)
	One of the most popular implementation of ORM hibernate
	JPA is the most common way to do database interaction using java
	JPA is responsible for creating the queries based on the database which is being used
	you just have to call appropriate methods of JPA
	Ex :
		for inserting record we have persist() method
		for deleting record we have remove() method
		for selecting record we have find() method

steps for using JPA:
	1. Add appropriate maven dependencies
	2. Annotate model class with JPA annotation
	3. Create persistence XML file in META-INF folder inside src/main/resource
	4. Create appropriate properties in persistence.xml
	5. Create EntityManagerFactory object
	   EntityManagerFactory is a heavy weight object and hence only in object is create for one application
	6. Create EntityManager object
	   EntityManager object is light weight and not thread safe and hence it is create for every
	   database interaction
	7. Create EntityTransaction object
	8. Begin Transaction
	9. perform database operation 
	10. commit the transaction
	11. close EntityManager object
	
<property name="hibernate.hbm2ddl.auto" value="create"></property>
create:
	It recreates the schema every time hence it is not useful in production it is useful in
	Development
update:
	It creates the schema only if doesn't exist	
validate:
	This is used validate the database schema against entity mapping
	this value is used in production

Important Annotations for JPA
	1. @Entity: It is used as in class level
				It Denotes this class should be treated as table in the database
		
	2. @Id: It is used on the field of class which we want to be treated as primary key
	
	3. @ElementCollection: It is used to map collection object with a table
	
-By default entity class name is consider as the table name and field names are considered as column names.
-It is possible to customize the behavior also additional constrains
 can be applied using following annotation.
 
 	4. @Table: It is use to tell JPA what should be the table name
 			   It is written on top of Entity class
 			   
 	5. @Column: It is used to customize the column name
 				It is written on top of field
 				
 	6. @Transient: It is used to tell JPA not to save a specific field in the table
 				   It is written on top of field
 	
 	7. @CollectionTable: It used to customize column name and table name for ElementCollection
 	
 	8. @GeneratedValue: It is used to specific how to increment the value for @Id column
 	
 ------- JPQL -------
 	-Stands for Jakarta Persistence Query Language
 	-It is similar to SQL which is allows you to query database but important difference is
 	SQL works on columns and table where as JPQL works on class fields and the class names
 	For Example:
 				SQL : SELECT * FROM table_name
 				JPQL: FROM entityClassName

 	
 Fetching strategies
 	-when we are trying to fetch one object from the database and which has a field
 	which has multiple values this relationship is known an one-to-many relationship
 	Example:
 			one Student many Subjects
 	-when we ask hibernate to fetch one student it associated many subjects are not loaded
 	by default this is done because to optimize the resource utilization to save the resources
 	-In other words many side of the object is never loaded by default by hibernate to save the
 	resources, this is called as "Lazy Initialization" also lazy fetch type
 	-In order to change this default behavior we have to change the fetch type strategy
 	this is done as shown
 			@ElementCollection(fetch = FetchType.EAGER)
 	-Though this is possible as mentioned earlier this would degrade the performance
 	as it would fetch all the records for which we has to fire multiple queries
 	-So, instead changing the fetch type to eager recommended approach is fetch all
 	records only when asked by user. This can be done using JPQL.
 	"FROM Student AS s LEFT JOIN FETCH s.subjectsLearning"
 	-Above JPQL query fetch all the records in just one query
 	
 	
------- Entity Lifecycle -------

	-Every entity goes via lifecycle based on association of the entity with EntityManager
	-There are following stages of Lifecycle:
		1. Transient: In this stage entity is not yet associated with EntityManager object.
					  Any changes made to the object in this stage are not tracked by hibernate(JPA),
					  which means changes are not made to database.
					  
		2. Persistence: In this stage entity is associated with EntityManager object.
						Any changes made to the object in this stage are tracked by hibernate(JPA),
					  	which means changes are made to database also.
					  	In order to have any interaction with any database EntityManager object must
					  	be open.
 	
 		3. Detatched: In this stage entity is not association with EntityManager object but it was.
 					  Any changes made to the object in this stage are not tracked by hibernate(JPA),
					  which means changes are not made to database.
 	
 	
 	
 	
 	
 	