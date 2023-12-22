Imperative programming
	-An imperative programming developer needs to explicitly code each step thus focus of developer is
	 "How to do it".
	
Declarative Programming
	-it is a style of programming in which we specify what a program shoild do without explicitly coding each step.
	-And thus focus of developer is "What to do "and not how
	-for declarative programming functional style programming is used.
	-hence in java Lambdas are used heavily
	
Stream
	-It is introduce in Java 8.
	-It is used to process collection of Objects.
	-Streams don't changes original data.
	-Streams takes input either from collection or array.

Types of operation possible on stream are as follows:
	1.Intermediate operation : this operation return stream again.
	  n other words, any operation that return stream is intermediate operation.
	  -eg of intermediate operation : filter(), map().
	2.Termination operation : this operation returns final result (Non-Stream).
	  -eg : collect(), toList().
	
Steps to use Streams:	
	1.Create stream from source (Source can be either collection or array).
	2.invoke any number of intermediate operation (as per the requirement).
	3.Invoking terminal operation and get  result.
	

							Intermediate Operations
---------------------------------------------------------------------------------------

Operation						purpose											Input

filter()		to the stream based on the given predicate					Predicate<T>
map()			transform the data from one from to another					Function<T,R>
sort()			to sort the data (asc/desc)									No Input, Comparator


							Terminal Operations
---------------------------------------------------------------------------------------

Operation						Purpose											Input

count()			to the count the number of element present					No Input
reduce()		is used the reduce elements of a string to single value		T initial_value, Binary Operation
forEach()		it is used to consume the given object						Consume<T>
collect()		to collect a stream of object into list, set, map			Collectors.toList(), Collectors.toSet(), toMap()
toList()		to collect stream of object into list 						N/A
Note: toList() is added in JDK 16.

anyMatch()		returns whether any elements of the given stream			Predicate<T>
				matches the given element
	
	