Caution : be careful to to use junit5 annotat6ion and not junit4 annotation
		  few annotation in jutin4 and 5 are same but their packages are different
		  Example: @Test in junit4 it is org.junit
		      	   @Test in juint5 it is org.junit.jupiter.api

JUnit Annotations

1. @Test		: It is used to denote as method as Test method
2. @BeforEach 	: It is used to denote method should be executed Before each test cases
   --Name of the method @BeforeEach with any thing but setUp() is the convention used by the developers
3. @AfterEach	: It is used to denote method should be executed After each test cases
   --Name of the method @AfterEach with any thing but tearDown() is the convention used by the developers
4. @DisplayName	: It is used to give custom user-friendly name to test method and test class
5. @Timeout		: It is used to failed test if it exceeds the given time duration
6. @RepeatedTest: Denotes that the  test method 
