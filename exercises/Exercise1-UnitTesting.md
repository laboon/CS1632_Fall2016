# Exercise 1 - Unit Testing

## Description

In this exercise, we will simulate the main Rent-A-Cat rental system software.  This is obviously a "toy" implementation of the vast and powerful Rent-A-Cat apparatus.

Rent-A-Cat rents cats to customers for various needs (mousing, companionship, homework help, etc.).  From the main menu, users may:

1. See list of cats for rent
2. Rent a cat to a customer
3. Return a cat
4. Quit

A cat which is out for rental cannot be rented and will not be listed until it has been returned.  When a cat is returned, the renter pays the business the amount that is owed.  

## Sample Output

```
Option [1,2,3,4] > 1
Cats for Rent
ID 1. Jennyanydots: $200.00 / day
ID 2. Old Deuteronomy: $250.00 / day
ID 3. Mistoffelees: $500.00 / day
Option [1,2,3,4] > 2
Customer ID > 100
That customer doesn't exist!
Customer ID > 200
Rent which cat? > 1
Jennyanydots has been rented to Customer Lakshmi Singh.
Option [1,2,3,4] > 1
Cats for Rent
ID 2. Old Deuteronomy: $250.00 / day
ID 3. Mistoffelees: $500.00 / day
Option [1,2,3,4] > 2
Customer ID > 201
Rent which cat? > 1
Sorry, Jennanydots is not here!
Rent which cat? > 7
Invalid cat ID.
Rent which cat? > 3
Mistoffelees has been rented to Customer Ari Shapiro.
Option [1,2,3,4] > 1
Cats for Rent
ID 2. Old Deuteronomy: $250.00 / day
Option [1,2,3,4] > 3
Return which cat? > 7
Invalid cat ID.  
Return which cat? Jennyanydots
Invalid cat ID.
Return which cat? 1
Lakshmi Singh paid $200.00.
Welcome back, Jennyanydots!
Option [1,2,3,4] > 1
Cats for Rent
ID 1. Jennyanydots: $200.00 / day
ID 2. Old Deuteronomy: $250.00 / day
Option [1,2,3,4] > 4
Closing up shop for the day!
```


You may assume that customers always return cats after one day.  You may make up whatever names of cats/customers you like.  You may have as many or as a few cats and customers as you like, as long as there are at least two of each.

You should create a collection of Cat objects and Customer objects, along with a main RentACat class.  The Cat class should have at least two methods (rent() and return()), along with relevant attributes which allow you to display the data above (e.g. name, cost, etc.).  The Cat class should also keep track of who, if anybody, has rented that particular cat.  I'd also recommend adding a .toString() method which returns a String representation of the cat including ID, name, and rental rate.

You should also write appropriate unit tests for each public method.  For each public method, write at least two unit tests.  The only exception is `public static void main`.  Testing this directly would be like testing the system as a whole, which is not the goal of unit testing.

You should use test doubles/mocks for any references to classes other than the one under test.

I recommend grouping the options for 1, 2, and 3 (list, rent, and return cats) into their own methods in the RentACat class, and have them return the appropriate string to display or a boolean.

Be sure to check to see if a cat ID or customer ID exists!  Our customer service representatives sometimes make typos.

## Running Unit Tests

If you do this in an IDE such as Eclipse, or with a build tool like Gradle, this can be handled automatically.  HOWEVER, please do not do this!  I want you to realize what is happening "behind the scenes".

First, we need to create a test runner.  I have created a simple one (TestRunner.java) for you, along with some very simple unit test class files.  They are located in the CommandLineJunit subdirectory under the exercises subdirectory in the class repo.  This will also include the two jar files you will need to use junit.

To run it, you will need to compile it and ensure that the junit and hamcrest jars are in your classpath.

```
$ javac -cp .:./junit-4.12.jar:./hamcrest-core-1.3.jar *.java

$ java -cp .:./junit-4.12.jar:./hamcrest-core-1.3.jar TestRunner
testShouldFail(NoogieTest): expected null, but was:<java.lang.Object@22d8cfe0>
testMeowAndBarkAreEqualWillFail(CoogieTest): expected:<[Meow]> but was:<[Bark]>

!!! - At least one failure, see above.
```

You will need to write your own test files, of course (you may use NoogieTest and CoogieTest as basic templates).

Replace ":" with ";" on Windows machines ( `java -cp .;./junit-4.12.jar;./hamcrest-core-1.3.jar TestRunner` ) .  If you are using Windows 7, you will also need to put the classpath argument entirely in quotes ( `java -cp ".;./junit-4.12.jar;./hamcrest-core-1.3.jar" TestRunner` )

Don't use "~" or other shortcuts when referring to the path that the `junit` and `hamcrest` jar files live.  Your Java files may compile but then won't run - apparently the `-cp` option in `javac` parses paths different than `java`.  This is because LOL programming.

## Tips

1. Check to see if junit works on your machine (either through the IDE or command line) before starting to code.
1. Don't write all the code and then write tests - write tests as you go along!  This way you will discover what is easy and hard to test, and shake out the problems as you go along.  Otherwise, you will be stuck trying to fix all of them at the very end, and may have to do some major code refactoring to get back to a reasonably testable system.
1. Remember to _not_ double the class under test, only classes that it depends upon.
2. The easiest thing to do is assert against a return value, but you can also assert against attributes of an object.  For example:
```
@Test
public void testChangeCatName() {
   Cat c = new Cat("Bustopher Jones", 150.00);
   String newName = "Growltiger";
   c.setName(newName);
   assertEquals(c.getName(), newName);
}
```
3. If you are going to have to double an object inside a method, be sure to allow it to be passed in as an argument!  This is called _dependency injection_.  We will discuss further in the lecture __Writing Testable Code__.  Example:
```
// BAD - how can we double Duck?
public int lotsOfQuacks() {
    Duck d = new Duck();
    int numQuacks = 0;
    for (int j = 0; j < 100; j++) {
        numQuacks += d.quack();
    }
    return numQuacks;
}

// BETTER - dependency injection
public int lotsOfQuacks(Duck d) {
    int numQuacks = 0;
    for (int j = 0; j < 100; j++) {
        numQuacks += d.quack();
    }
    return numQuacks;
}
```
4. Try to ensure that you check not only for "happy path" cases but also edge cases.
5. Tests are usually grouped into whichever classes they are testing, and have a filename that has `Test` appended to the name.  For example, Foo.java would be tested by FooTest.java.
6. Testing println's or other output is difficult - try to have methods return Strings which are easier to test.  It is possible to test for I/O but it requires some extra steps - see Chapter 14, Section 6 of the textbook for instructions.

