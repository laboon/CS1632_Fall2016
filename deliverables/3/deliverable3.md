# CS 1632 - Software Quality Assurance
Fall Semester 2016

DUE 1 NOV 2016

## Deliverable 3

For this assignment, you and a partner will write a systems-level, automated black-box tests for a Ruby compilation visualizer using Selenium and JUnit.  You should substantially test the arithmetic functionality for the entire project, and note in the "Testing Concerns" section what other aspects you would additionally add for full testing if this were a professional product.

Tests and code should be on GitHub or GitLab by the beginning of class on the due date.

You may work with ONE partner for this deliverable.  However, it CANNOT be the same person you worked with for Deliverable 1.  You may also opt to work by yourself, but the requirements for the assignment are the same.  

The Ruby compilation visualizer, Hoodpopper, is located here: http://lit-bayou-7912.herokuapp.com/

This is a Rails application written by me for Ruby compilation analysis so that I could improve performance in a Ruby app.  The code is located here: https://github.com/laboon/hoodpopper The tests you write can be black-box tests; you should not need to look at this code unless you're interested.  If you'd prefer to do some grey-box testing, feel free to check out the code, but once again, it is not necessary.

## Format
Everyone should have a title page with:
* The name of the project under test
* Your name
* The title "CS 1632 - DELIVERABLE 3: Systems Testing A Web Application"

For the summary, add a description of issues you faced when writing these tests and problems you would expect going forward based on your experiences.  If any tests you wrote fail, they should be included here.  Also note if there are any special steps to get the tests running.

At the end of this section, note where your test code is located.  

After this, there should be a printout or screen shot of the test execution results.

There is no need to print out the code.  It should be shared with me and Adam (usernames laboon and greenmanspirit, respectively) on GitHub BY THE BEGINNING OF CLASS.

The JUnit tests shall have a description (a few sentences at most) of what they are testing written in the comments above the particular test. See RedditTest.java in the sample_code directory for an example.

Remember these are USER-level systems tests; they should discuss things in a way that an intelligent user of the software would understand.  Remember the differences between scenario tests and unit tests!

There should be a bare minimum of fifteen tests, checking various base, edge, and corner cases.  There is a maximum of twenty-five tests.  However, do not focus on the number of tests too heavily; I am more concerned that you cover a broad variety of cases, and ones which are focuses and still likely to find defects.

If you find yourself with more than two or three assertions in a test case, that is a code smell that it is not focused enough.

## Ruby Basics

I do not expect you to learn yet another language for this course.  However, you will often be thrown into situations where you do not have deep domain knowledge but you will have to work on tests.  Here is a basic primer for the application.

Ruby is a dynamic, reflective, object-oriented language.  It is heavily used in web applications (via the Rails and Sinatra frameworks).

Variable types are not specified.  Just assign a value to a variable and use it.

```ruby
a = 10
```

Ruby supports all of the basic arithmetic operations and follows normal precedence.

```ruby
a = 5
b = 6
c = a + (b * 4)
```

The equivalent of System.out.println("foo") is `puts "foo"`

```ruby
the_best_cat = "Noogie Cat"
puts "The best cat is: " + the_best_cat
```

This is all the Ruby you will need to know in order to properly test the program.  You may focus only on basic arithmetic (+, -, *, /), variables, and printing for this assignment.

Now, for some compiler theory.  If you have taken compilers, this is a very brief, hand-wavy and possibly less-than-accurate introduction.  If you would like to go more into detail, you can take CS1622 Compiler Design.  Compiling a Ruby program consists of three stages: tokenization, parsing, and actually compiling to bytecode.  First, the tokenizer goes through and separates the code you have written into tokens, e.g., "public", space, "static", space, etc.  The parser puts this into an abstract syntax tree (AST) - just think of it as a regular tree with the structure of your program.  Finally, the compiler goes through the AST and writes the actual machine-level instructions to an executable.  This is how your Java code become JVM bytecode, or your C code becomes x86 instructions.  In this case, we will construct bytecode for the YARV (_Yet Another Ruby VM_, Ruby's default virtual machine).

I do not expect you to understand the entire compilation process, or to memorize all of the operations.  Understanding the following should be enough to write sufficient tests for this assignment.

_Tokenization_: Know that any spaces should show up as `:on_sp`.  Identifiers for functions such as `puts` should show up as `:on_ident`.  Variables such as `a` are also identifiers.  Newlines should show up as `:on_nl`.  Operators such as `+` and `*` are identified with `:on_op`.

_Parsing_: Any non-whitespace (e.g. `:op_nl` or `:on_sp`) tokens (such as `+`, `-`, or `puts`) which appear when being tokenized should also appear in the AST (parse tree).  Whitespace tokens should not appear in the AST.

_Compiling_: Any program that contains `puts` should also have the `putstring` YARV operation.  A program which contains `+` should call the opt_plus operation, plus put any of the values specified on the stack using the `putobject` operation.  Any program which contains `-` (subtraction) should contain the `opt_minus` operation, any program with `/`(division) should contain `opt_div`, any program with `*` should contain `opt_mult`.

## Format Of Program

I would like a JUnit test suite which uses the Selenium libraries.

I do not want raw Selenese or IDE instructions, although you may use these to help you along in your assignment.  If you auto-generate any code, it must be cleaned up before turning it in (e.g., if there are auto-generated methods which are not used, you must delete them!)

## Note on Selenium Drivers

Note that the driver I use in class, HtmlUnitDriver, is its own project and no longer included with the latest Selenium release.  You may download it separately from: https://github.com/SeleniumHQ/htmlunit-driver/releases

You may find it easier to use the last version of Selenium which includes HtmlUnitDriver.

2.52 Selenium Server jar: http://selenium-release.storage.googleapis.com/2.52/selenium-server-standalone-2.52.0.jar

2.52 Java bindings jar: http://selenium-release.storage.googleapis.com/2.52/selenium-java-2.52.0.zip

Either way is acceptable for our purposes.

## Note on Firefox / Selenium in Windows

To open the Selenium IDE from Firefox in Windows, right click the top bar of firefox, between the open tabs and the minimize button. Click "Menu Bar" so the menu bar shows up in the top left corner. Under "Tools" is "Selenium IDE".

Alternatively, "ctrl+alt+s" while in the Firefox window should also bring up the IDE.

## Grading
* Summary and Testing concerns - 10% 
* Screen shot or printout of test results - 10%
* Proper commenting - 30%
* JUnit Tests - 50%

Please feel free to email me or come to office hours to discuss any problems you have. 
 
