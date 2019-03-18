Adapter pattern is a software design pattern that allows the interface of an existing class to be used as another interface.
                It is often used to make existing classes work with others without modifying their source code.
                
The adapter design pattern solves problems like:
	- How can a class be reused that does not have an interface that a client requires?
	- How can classes that have incompatible interfaces work together?
	- How can an alternative interface be provided for a class?
	
The adapter design pattern describes how to solve such problems:

Define a separate adapter class that converts the (incompatible) interface of a class (adaptee) into another interface (target) clients require.
Work through an adapter to work with (reuse) classes that do not have the required interface.
The key idea in this pattern is to work through a separate adapter that adapts the interface of an (already existing) class without changing it.

Clients don't know whether they work with a target class directly or through an adapter with a class that does not have the target interface.

 - Object Adapter, implements the target interface by delegating to an adaptee object at run-time (adaptee.specificOperation()).
 
 - class adapter implements the target interface by inheriting from an adaptee class at compile-time (specificOperation()).
 
 