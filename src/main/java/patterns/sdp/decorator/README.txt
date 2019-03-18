Decorator Pattern - allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.

What problems can the Decorator design pattern solve?
	- Responsibilities should be added to (and removed from) an object dynamically at run-time.
	- A flexible alternative to subclassing for extending functionality should be provided.

Define Decorator objects that

	- implement the interface of the extended (decorated) object (Component) transparently by forwarding all requests to it and
	- perform additional functionality before/after forwarding a request.
	

The decorator pattern can be used to extend (decorate) the functionality of a certain object statically, or in some cases at run-time, independently of other instances of the same class, provided some groundwork is done at design time. 
This is achieved by designing a new Decorator class that wraps the original class. This wrapping could be achieved by the following sequence of steps:

	1. Subclass the original Component class into a Decorator class (see UML diagram);
	2. In the Decorator class, add a Component pointer as a field;
	3. In the Decorator class, pass a Component to the Decorator constructor to initialize the Component pointer;
	4. In the Decorator class, forward all Component methods to the Component pointer; and
	5. In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified