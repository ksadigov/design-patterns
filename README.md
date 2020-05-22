# Design Patterns

![Image](images/gof.jpg)


Design patterns provide solutions to common software design problems. 
In the case of object-oriented programming, design patterns are generally aimed at solving the problems of object generation and interaction, 
rather than the larger scale problems of overall software architecture. 
They give generalised solutions in the form of templates that may be applied to real-world problems.

## Creational

- **Abstract Factory**<br/>
    Abstract Factory patterns work around a super-factory which creates other factories. 
    This factory is also called as factory of factories.
- **Builder**<br/>
    Builder pattern builds a complex object using simple objects and using a step by step approach.
- **Factory Method**<br/>
    In Factory pattern, we create object without exposing the creation logic to the client and refer to 
    newly created object using a common interface.
- **Prototype**<br/>
    This pattern involves implementing a prototype interface which tells to create a clone of the current object. 
    This pattern is used when creation of object directly is costly. 
    For example, an object is to be created after a costly database operation. 
    We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
- **Singleton**<br/>
    This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. 
    This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

## Structural

- **Adapter**<br/>
    Adapter pattern works as a bridge between two incompatible interfaces.
    This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces.
    A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. 
    You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.
- **Bridge**<br/>
    Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently.
    This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. 
    Both types of classes can be altered structurally without affecting each other.
- **Composite**<br/>
    Composite pattern is used where we need to treat a group of objects in similar way as a single object.
    This pattern creates a class that contains group of its own objects. 
    This class provides ways to modify its group of same objects.
- **Decorator**<br/>
    Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
    This pattern creates a decorator class which wraps the original class and 
    provides additional functionality keeping class methods signature intact.
- **Facade**<br/>
    Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
    This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
- **Flyweight**<br/>
    Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.
    Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object 
    when no matching object is found. 
    We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. 
    Only 5 colors are available so color property is used to check already existing Circle objects.
- **Proxy**<br/>
    In proxy pattern, a class represents functionality of another class.


## Behavioral

