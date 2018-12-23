CREATIONAL DESIGN PATTERN - are concerned with the way in which objects are created, used to simplify the creation of objects to make them more adaptable to different situations.

The new operator is often considered harmful as it scatters objects all over the application. 
Over time it can become challenging to change an implementation because classes become tightly coupled.

Creational Design Patterns address this issue by decoupling the client entirely from the actual initialization process.

 1. Singleton – Ensures that at most only one instance of an object exists throughout application. Ways to implement singleton.
    Implementing Singleton has 2 options
	
	1. Lazy loading
	
	2. Early loading
	
	Approaches to create Singleton are - Refer https://stackoverflow.com/a/16580366/3244110
 
 	a. Singleton with public final field
 	 
 	b. Singleton with static factory
 	 
 	b. Enum Singleton - https://stackoverflow.com/a/26285731/3244110
 	
 	d. Singleton with static Inner class - using Initialization-on-demand holder idiom - https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 
 2. Factory Method - uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. 
 
 	The Factory Method design pattern solves problems like:
 		- How can an object be created so that subclasses can redefine which class to instantiate?
    	- How can a class defer instantiation to subclasses?

	Creating an object directly within the class that requires (uses) the object is inflexible because it commits the class to a particular object and makes it impossible to change the instantiation independently from (without having to change) the class.

	The Factory Method design pattern describes how to solve such problems:
		- Define a separate operation (factory method) for creating an object.
 		- Create an object by calling a factory method.
	
	This enables writing of subclasses to change the way an object is created (to redefine which class to instantiate).
 
 	Factory method is generally used when you have some generic processing in a class, but want to vary which kind of object you actually use by implementing a factory method in subclass.
 
 3. Abstract Factory – provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
 
 	The Abstract Factory design pattern solves problems like:
		- How can an application be independent of how its objects are created?
		- How can a class be independent of how the objects it requires are created?
		- How can families of related or dependent objects be created?
	
	Creating objects directly within the class that requires the objects is inflexible because it commits the class to particular objects and makes it impossible to change the instantiation later independently from (without having to change) the class. 
	It stops the class from being reusable if other objects are required, and it makes the class hard to test because real objects can't be replaced with mock objects.

	The Abstract Factory design pattern describes how to solve such problems:

		- Encapsulate object creation in a separate (factory) object. That is, define an interface (AbstractFactory) for creating objects, and implement the interface.
		- A class delegates object creation to a factory object instead of creating objects directly.
	
	This makes a class independent of how its objects are created (which concrete classes are instantiated). A class can be configured with a factory object, which it uses to create objects, and even more, the factory object can be exchanged at run-time.

	NOTE: Difference b/w Factory, Factory Method and Abstract Factory - https://stackoverflow.com/a/13030163/3244110
	
 4. Builder – Constructs complex objects using step-by-step approach

 5. Prototype -  Used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. This pattern is used to :
				 avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.
				 
				 Refer: https://stackoverflow.com/a/11706548/3244110
				 
				 In Java user Copy Constructor Instead of Cloneable - Ref. Effective Java Item 13.
				 
 
