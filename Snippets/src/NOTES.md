* Static factory : public static factory method instead or in addition to public constructor.
	
	Advantages : 
		- We don't need to know anything about the implementations we only depends on interfaces : ICar bmw = CarFactory.newCar("BMW", "318i");
		Better than new BMW("318i") => dependency on a concrete implementation!
		- Factory methods has names 
			In cases where a class seems to require multiple constructors with the same signature, replace the constructors with static factory methods and carefully chosen names to highlight their differences
		- They are not required to create a new instance every time they are invoked
		- They can return any subtype of their return type

		
* Abstract Factory: build an object family

* Factory Method : define an abstract method for creating objects but defers to the sub classes the implementation of this method
