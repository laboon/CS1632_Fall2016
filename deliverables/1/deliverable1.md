# CS 1632 - Software Testing
Fall Semester 2016

* DUE: 22 SEP 2016

## Deliverable 1

For this assignment, your group will determine a test plan for the simple game Professor Wumpus, based on the requirements listed.  There are several known defects in the software; you will need to find and report on at least three.  Additionally, a traceability matrix showing the mapping of test cases to requirements is required.  

Time will be given in class to group yourself into groups.  There should be two and only two members of a group.

There should be at least twice as many test cases as requirements, although I would normally expect several test cases per requirement.  If the number of test cases is more than 3x the number of requirements, you are probably overtesting.

Each requirement should have AT LEAST one test case associated with it, and each test should have EXACTLY ONE requirement associated with it.  This can easily be checked via a traceability matrix (which you should also deliver).  

Test cases should mention all necessary preconditions, execution steps, and postconditions.

It is NOT necessary to make multiple test plans inside a test suite; it is enough for there to be one test plan.

I expect you to test three edge or corner cases as part of the test plan.  These should be marked in the description of the relevant test case.

It is expected that you actually execute the test plan in order to find the defects.  There are AT LEAST three.  Full credit will be given only to those who properly find and describe at least three.  While you are not expected to find *all* of the defects, a reasonable test plan should definitely find at least three.  This is an intentionally target-rich environment.

## Format
Please hand in the paper to me with a cover page with:
* The name of the project under test ("Professor Wumpus")
* The names of the people in the group
* The title "CS 1632 - DELIVERABLE 1: Test Plan and Traceability Matrix"

There should be a short introduction (a few paragraphs) in which you may note any concerns or difficulties you may have had or anticipate with the testing process.  You should also note why you considered certain test cases, how you thought of edge cases, etc.

This should be followed ON A NEW PAGE by the list of test cases.  You may name or number them any way you wish, but be consistent.  You should write them out in this format -

	IDENTIFIER:
	TEST CASE: 
	PRECONDITIONS:
	EXECUTION STEPS:
	POSTCONDITIONS:

The IDENTIFIER is some value which will UNIQUELY specify the test case.  It can be a number, word or any other mnemonic (e.g. TEST-WALL-SPACING, TEST-NUM-PROFESSORS).

ON A SEPARATE PAGE, a traceability matrix should be provided mapping the test cases with their associated requirements.  Remember that all requirements should map to AT LEAST ONE test case, and all test cases should map to EXACTLY ONE requirement.  

Finally, ON A SEPARATE PAGE, list at least three defects found.  The defects should follow the defect reporting template:

	 SUMMARY:
	 DESCRIPTION:
	 REPRODUCTION STEPS:
	 EXPECTED BEHAVIOR:
	 OBSERVED BEHAVIOR:

Other attributes of a defect (e.g., SEVERITY or IMPACT) are not necessary.  The test case which found the defect should be listed as part of the DESCRIPTION.

## Grading
* Introduction: 10% of grade
* Test Plan: 40% of grade
* Traceability Matrix: 20% of grade
* Defects Found and Described: 30% of grade

## Professor Wumpus
Professor Wumpus is an action-packed game of turning in your CS homework.  There are three characters:

1. *Student* - This is the player.  The player can move North, South, East or West.  The goal of the player is to find the Assignment (hidden in a random room) and then turn it in to Professor Wumpus, thus winning the game.  If you encounter Professor Wumpus before you find the paper, you lose the game.
2. *TA* - The TA wanders around the rooms randomly.  If you encounter her, you will flee in terror to a random room.  The TA carries a stack of graded papers, whose rustling you can hear from one room away.
3. *Professor Wumpus* - Professor Wumpus stays in one room and mumbles on Computer Science topics (allowing you to hear him from one room away).

You can run it downloading the profwumpus.jar file and running:
```bash
java -jar profwumpus.jar
```

You may optionally include a random number seed (any 32-bit signed integer value) as the sole argument to the program.  Without a seed, the numbers will be pseudorandom based on the default Java Random class.  Otherwise, the integer will act as the seed and allow true reproduction (since the "random" numbers will be the same for each run).

The requirements are listed in the file requirements.txt.

Please feel free to email me at laboon at cs pitt edu or come to office hours to discuss any problems you have. 
 
