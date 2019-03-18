Interpreter pattern is a design pattern that specifies how to evaluate sentences in a language.

The basic idea is to have a class for each symbol (terminal or nonterminal) in a specialized computer language.

What problems can the Interpreter design pattern solve?

 - A grammar for a simple language should be defined.
 
 - so that sentences in the language can be interpreted.
 
What solution does the Interpreter design pattern describe?

 - Define a grammar for a simple language by defining an Expression class hierarchy and implementing an interpret() operation.
 
 - Represent a sentence in the language by an abstract syntax tree (AST) made up of Expression instances.
 
 - Interpret a sentence by calling interpret() on the AST.
 
 