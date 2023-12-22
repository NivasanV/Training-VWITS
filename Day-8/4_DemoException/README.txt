Exception is any abnormal situation because of programs terminates abruptly without any intimation to the end user
It is Strongly recommend the developer handle all the exceptions
In Java there following 5 keywords deal with exception handling

1)try:
	It is block its is used to write doubt full statements
	In other words statements might throw exception should be written in this block

2)catch:
	It is used to handle the exception
	catch block is return immediate try block
	
3)finally:
	finally block is used to write statements which must execute irrespective of whether the exception is generated or not
	Example : closing all the resources must be done in the finally block(File resources, Database resources)

4)throw:
	It is used to throw the exception programmatically
	useful in case of custom exception(User-defined exception)
	
5)throws:
	It is used to declare that method might throw an exception
	throws is a class
	
Steps To Create Custom Exception:
	1.Create a Class
	2.Extend it from Exception

VALID COMBINATIONS
	try{}
	catch(Exception e){}
-----------------------------------------------------
	try{}
	catch(RuntimeException e){}
	catch(Exception e){}
-----------------------------------------------------
	try{}
	catch(RuntimeException e){}
	catch(Exception e){}
	finally{}
------------------------------------------------------
	try{}
	catch(NullpointerException | SQLException e){}		//this is multicatch feature added in 1.7
	catch(Exception e){}
	finally{}
-----------------------------------------------------
	try{}
	finally{}
-----------------------------------------------------
	try{}
	finally{}
--------------------------------------------------------
	try{
		try{}
		finally{}
	}
	catch(RuntimeException e){}
	catch(Exception e){}
	finally{}
------------------------------------------------------------
 
	try{
		try{}
		finally{}
	}
	catch(RuntimeException e){}
	catch(Exception e){}
	finally{
		try{}
		catch(Exception e){}	
	}
----------------------------------------------------------------


INVALID COMBINATIONS
 
	try{}
-----------------------------------------------------
	try{}
	catch(Exception e){}			//Generic Exception MUST be last
	catch(RuntimeException e){}
-----------------------------------------------------
	try{}
	catch(RuntimeException e){}
	finally{}
	catch(Exception e){}
-----------------------------------------------------
	catch(Exception e){}
	finally{}
-----------------------------------------------------
	try{}
	int i = 10;
	finally{}