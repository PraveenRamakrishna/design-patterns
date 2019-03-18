Facade Pattern, use the facade design pattern when a system is very complex or difficult to understand because the system has a large number of interdependent classes or because its source code is unavailable. 
				This pattern hides the complexities of the larger system and provides a simpler interface to the client. It typically involves a single wrapper class that contains a set of members required by the client. 
				These members access the system on behalf of the facade client and hide the implementation details.
				
What problems can the Facade design pattern solve?

	- To make a complex subsystem easier to use, a simple interface should be provided for a set of interfaces in the subsystem.
	- The dependencies on a subsystem should be minimized.
	
Clients that access a complex subsystem directly refer to (depend on) many different objects having different interfaces (tight coupling), which makes the clients hard to implement, change, test, and reuse.

What solution does the Facade design pattern describe? Define a Facade object that

	- implements a simple interface in terms of (by delegating to) the interfaces in the subsystem and
	- may perform additional functionality before/after forwarding a request.
	
This enables to work through a Facade object to minimize the dependencies on a subsystem. 