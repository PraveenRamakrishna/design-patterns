Command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. 

This information includes 
	- the method name
	- the object that owns the method and 
	- values for the method parameters.
	
Four terms always associated with the command pattern are 
	- Command
	- Receiver
	- Invoker and 
	- Client. 
	

What problems can the Command design pattern solve?
 - Coupling the invoker of a request to a particular request should be avoided. That is, hard-wired requests should be avoided.
 
 - It should be possible to configure an object (that invokes a request) with a request.
 
What solution does the Command design pattern describe?
 - Define separate (command) objects that encapsulate a request.
 
 - A class delegates a request to a command object instead of implementing a particular request directly.