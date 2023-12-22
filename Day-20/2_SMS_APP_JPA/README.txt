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

Important Annotations for JPA
	1. @Entity: It is used as in class level
				It Denotes this class should be treated as table in the database
		
	2. @Id: It is used on the field of class which we want to be treated as primary key
	
	3. @ElementCollection: It is used to map collection object with a table
	