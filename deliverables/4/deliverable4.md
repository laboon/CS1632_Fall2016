# CS 1632 - Software Quality Assurance
Fall Semester 2016

DUE 10 NOV 2016

## Deliverable 4

For this assignment, you and a partner will profile some monkey simulation software, and improve its performance by refactoring three methods (to be determined by the results of the profiling), as well as writing appropriate pinning tests for each of them.  This will consist of several parts:

1. Profiling (before) to determine which method is the most CPU-intensive
2. Adding at least three pinning tests (in the form of unit tests) to each modified method to show that the functionality is unchanged by your modifications
3. Refactoring the method to be more performant (from a CPU and time perspective)
4. Profiling (after) showing that your rewrite helped make your method more performant
5. Finally, running the entire program with time (or measure-command for Windows) to show that total time has decreased

Code will be on Github (https://github.com/laboon/MonkeySim).  Please _duplicate_ (https://help.github.com/articles/duplicating-a-repository/) it and create your own repository.  

This code runs MonkeySim, which simulates a group of monkeys throwing a banana back around until it gets to the first monkey.  It accepts one argument, which states which monkey has the banana initially.

The game shall continue until the first monkey gets the banana, at which point the simulation shall end.

The monkey who has the banana shall throw it to another monkey during each round.

If a monkey is even-numbered (e.g., monkey #2, monkey #4, etc.), then the monkey with the banana shall throw the banana to the monkey equal to one-half of that initial monkey's number.  For example, monkey #4 shall throw the banana to monkey #2, and monkey #20 shall throw the banana to monkey #10.

If a monkey is odd-numbered (and not monkey #1), the monkey with the banana shall throw it to the monkey equal to three times the number of that monkey plus one `(3n + 1)`.  For example, monkey #5 shall throw the banana to monkey #16 `((3 * 5) + 1)`.

If Monkey #1 catches the banana, the system shall display the number of rounds it took for Monkey #1 to catch the banana and then the program shall exit.

At each round, the current status of who is doing the throwing and who is catching shall be displayed, along with the round number (which should start at 1).  It should use the following format: "Round 1: Threw banana from Monkey (#54 / ID 223546) to Monkey (#27 / ID 223519)"

Each monkey has an ID; this ID shall remain constant.  For instance, Monkey #5 shall always have ID 223497, and Monkey #160 shall always have ID 223652.

Output for a given input should be EXACTLY the same as the initial output.  Sample runs are shown in the sample_runs.txt file.  Please be sure that your code operates the exact same way as the initial code.

In case of ambiguity in the requirements, the sample_runs.txt file shall be considered the correct implementation.

If you encounter an infinite loop (where, if the algorithm is implemented correctly, the first monkey NEVER gets the banana), you will receive a __sizable__ amount of extra credit, assuming you let me know the initial number you entered.

## Format
Every assignment should have a title page with:
* The name of the student
* The title "CS 1632 - DELIVERABLE 4: Performance Testing Using VisualVM"

There is no need to print out the code.  It should be available on GitHub or a similar code-sharing site BY THE BEGINNING OF CLASS.

In order to determine the "hot spots" of the application, you will need to run a profiler such as VisualVM (download at https://visualvm.java.net/).  Using a profiler, determine a method you can use to measurably increase the speed of the application without modifying behavior.  


For the summary, describe how you profiled the application and determined the methods to refactor, and why you changed what you did.  The summary should not be more than a few paragraphs - definitely less than a page. 

After this, include screenshots of VisualVM (or another profiler, if you use that) both before and after the refactor.  These screenshots should include the relevant sections that let you see what method to refactor.

As part of this assignment, you should create "pinning tests".  Pinning tests are unit tests which should check that the behavior of a modified method was not changed by your refactor (see the chapter on testing legacy code in AFIST for examples).  This program should work EXACTLY the same as before, except it should be faster and take up less CPU time.  The only exception is if you come across an error and fix it - no points will be taken off as long as you note it in your summary.

There should be a *bare minimum* of least three pinning tests per method modified (check different edge cases).  

You should execute at least three runs of the program before and after your changes, using the time method, and for each (before and after) list:

1. The maximum amount of real time it took to run with initial monkey equal to 23
2. The mean time of real time it took to run with initial monkey equal to 23

## Grading
* Summary - 10%
* VisualVM (or other profiler) screenshots (before and after) - 10%
* Initial and final times included - 10%
* Method choice and refactoring - 40%
* Pinning Tests - 30%

Please feel free to email me or come to office hours to discuss any problems you have. 
 
