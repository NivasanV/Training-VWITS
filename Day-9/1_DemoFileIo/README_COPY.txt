Files are used to store data permanently on secondary storage.
Java allows to deals with File Systems.
There are either of the two operation possible , either Read or Write.
to perform  Read operation we have to use InputStream.
To perform Write OPeration we have to use OutputStream.

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