package democonstructor;

import content.ConChild;
import content.ConParent;

public class Main {

    public static void main(String[] args) {

        ConParent one = new ConParent("fred");
        System.out.println("one: " + one.getName());

        ConChild two = new ConChild("bob");
        System.out.println("two: " + two.getName());

        ConParent three = new ConParent();
        System.out.println("three " + three.getName());
        
        ConChild four = new ConChild();
        System.out.println("four " + four.getName());

    }

}

/*
DemoConstructor
1.	Create DemoConstructor
2.	Create content folder-conParent class
3.	In conParent, 
a.	Private String name
b.	getName method
c.	constructor to set name;
d.	test it in main method
4.	to content, add ConChild class that is a subclass of ConParent 
a.	what happens? // cannot, because no default constructor in ConParent class
5.	to ConChild, add a constructor that
a.	takes a String para called name
b.	passes the String name to the parent constructor that takes a String//super(name)
c.	test it in main method
6.	to ConChild, add a default constructor that
a.	passes the String “Wilma” to its other constructor // this(“Wilma”)
b.	test it in main method
7.	to ConParent, add a default constructor that
a.	passes the String”Dino” to its other constructor  // this(“Dino”)
b.	test it in main method

*/
/*
Quick Recap
Every class has a constructor whether it’s a normal class or a abstract class.
Constructors are not methods and they don’t have any return type.
Constructor name should match with class name .
Constructor can use any access specifier, they can be declared as private also. Private constructors are possible in java but there scope is within the class only.
Like constructors method can also have name same as class name, but still they have return type, though which we can identify them that they are methods not constructors.
If you don’t implement any constructor within the class, compiler will do it for.
this() and super() should be the first statement in the constructor code. If you don’t mention them, compiler does it for you accordingly.
Constructor overloading is possible but overriding is not possible. Which means we can have overloaded constructor in our class but we can’t override a constructor.
Constructors can not be inherited.
If Super class doesn’t have a no-arg(default) constructor then compiler would not insert a default constructor in child class as it does in normal scenario.
Interfaces do not have constructors.
Abstract class can have constructor and it gets invoked when a class, which implements interface, is instantiated. (i.e. object creation of concrete class).
A constructor can also invoke another constructor of the same class – By using this(). If you want to invoke a parameterized constructor then do it like this: this(parameter list).
*/