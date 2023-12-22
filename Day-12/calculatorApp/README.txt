Unit Testing
	-Is the type of testing where individual components of software are tested
	-A purpose is to validate each unit of the software code performs as expected
	-Unit testing is done during development by developers
	-In java world smallest unit is method hence, in unit testing we check if method performs
	 and returns expected results
	-Unit tests are mandatory in every good software
	-Performing unit test manually is not only time consuming but also difficult job to do
	 hence, tool are used to perform unit testing
	-One of the most popular unit testing tool in java is Junit
	-It also gives us reports of unit testing in human readable format
	-The latest version of Junit is Junit5

Few best practices
	1. create test classes in src/test/java folder
	2. name of the test class must match name of the business under test suffixed
	   with Test
	3. package of the test class must match name of the business class under test
	4. name of the test method must match name of the business method suffixed
	   test name
	Note: Name of the test method should be meaningful and descriptive
		
Steps to use Junit:
	1. Add Juint dependencies in pom.xmlm
	2. mark each test method with @Test annotation
	3. divide your test into three parts:
		i) Given - here we will declare expected results
		ii)When  - we will call method under test
		iii)then - 
	
