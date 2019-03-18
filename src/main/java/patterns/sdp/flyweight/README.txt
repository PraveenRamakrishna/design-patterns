Flyweight Pattern, A flyweight is an object that minimizes memory usage by sharing as much data as possible with other similar objects,
				   it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory.
				   Often some parts of the object state can be shared, and it is common practice to hold them in external data structures and pass them to the objects temporarily when they are used.

What problems can the Flyweight design pattern solve?
	- Large numbers of objects should be supported efficiently.
	- 	Creating large numbers of objects should be avoided.
When representing large text documents, for example, creating an object for each character in the document would result in a huge number of objects that could not be processed efficiently.

What solution does the Flyweight design pattern describe?

Define Flyweight objects that

 - store intrinsic (invariant) state that can be shared and
 - provide an interface through which extrinsic (variant) state can be passed in.


Immutability and equality

To enable safe sharing, between clients and threads, Flyweight objects must be immutable. Flyweight objects are by definition value objects. 
The identity of the object instance is of no consequence therefore two Flyweight instances of the same value are considered equal.

Thread will help to clarify "a.equals(b) if and only if a==b." it return identical objects - https://stackoverflow.com/a/20847152/3244110

Concurrency

Special consideration must be made in scenarios where Flyweight objects are created on multiple threads. 
If the list of values is finite and known in advance the Flyweights can be instantiated ahead of time and retrieved from a container on multiple threads with no contention. 
If Flyweights are instantiated on multiple threads there are two options:

 - Make Flyweight instantiation single threaded thus introducing contention and ensuring one instance per value.
 - Allow concurrent threads to create multiple Flyweight instances thus eliminating contention and allowing multiple instances per value. This option is only viable if the equality criterion is met.