Component Communication:
	-This is a techniqe in which parent component and child component Communicate
	each other by sending data
	
	1. parent to child :
		to send the data from parent to child we need to use @Input Decorator
		following steps needs to be followed:
			1.Declare property in child component and Decorate with this @Input
			2.with in the tag of child component pass the data to child component
			using property binding syntax []

	2. child to parent :
		to send the data from child to parent we need to use @Output Decorator
		following step:
			1.Declare a field in the child component of type EvenEmitter
			2.Define a method in a child component which emit the data
			we send to parent component by calling emit() on EvenEmitter
			3.With in the tag of child component mention name of  EvenEmitter object
			and method of parent component using even binding syntax ()
			
create a new component StudentUpdate which is child component of Students component
StudentUpdate component should show details of selected students
rollNo must be Read-Only

