Files are used to store data permanently on secondary storage.
Java allows to deals with File Systems.
There are either of the two operation possible , either Read or Write.
to perform  Read operation we have to use InputStream.
To perform Write OPeration we have to use OutputStream.

Stream it is flow of data
All I/O related classes are stored in java.io package

Steps to use FileIO:
	1. Identify the operation you want to perform
	2. Based on the operation you want to perform, either used InputStream or OuputStream
	3. Associate the file with the stream object
	4. Invoke either read() method or write() method
	5. Close the resource
	
Note:
	1. When we are trying to read a file you must make sure that file exist otherwise FileNoteFoundException is thrown
	2. When we are trying to write a file be careful if file already exist override the content if file doesn't exist
	   creates a new file
	   
There are two major hierarchy in JAVA IO:
	1. InputStream, OutputStream hierarchy it is used to deal with Files such as Binary Data
	2. Reader, Writer Hierarchy i.e files which contains plain text
	   
ARM stands for Automatic Resource Management.
The Technique in which the resource are automatically closed and managed by JAVA.
We don't have to close resource explicitly.
This make code short and clean.
ARM is also known as TryWithResources.
It was introduced in JDK-1.7.
Any resources used with ARM must implements AutoClosable interface.
AutoClosable is built-in interface from java.lang package.
