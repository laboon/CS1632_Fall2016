# CS 1632 - Software Quality Assurance
Fall Semester 2016

DUE 22 NOV 2016

## Deliverable 5

For this assignment, you and a partner will use static analysis to improve the MonkeySimulator that you worked on for Deliverable 4.  So for those of you who wrote the code poorly, beware!

If you are working with somebody different for this deliverable, you may use either person's previous deliverable.  

This project will consist of the following steps:

1. Add code for a prime banana pass (see below for details)
1. Use findbugs to statically analyze your code
2. Fix *all* of the errors found by findbugs (with the exception of "Dead store to local variables" issues)
3. Use checkstyle with the included configuration file (google_checks_modified.xml) to find any style issues with your code and fix them.

Additionally, you may want to run findbugs and checkstyle as the FIRST steps, to see what issues they find and make sure that you do not repeat them in your code as you add the additional functionality.  This is an optional step but will probably save you time in the long run.

Example:
```
java -jar ~/checkstyle/checkstyle-7.0-all.jar -c ./google_checks_modified.xml ~/pitt/SlowLifeGUI/*.java
```

You will use findbugs, as described in class, to find possible bugs in your code.  Note that findbugs has a known issue with the "Dead store to local variable" analysis.  You may ignore any errors of this kind (you can filter them out or just mentally ignore them).

After you have modified the code, run checkstyle using the included google_checks_modified.xml configuration file on all of your code.  Fix all of the issues so that the style is in line with the modified Google code guidelines (these are actual Google Java style guidelines, btw, with only some small modifications by yours truly).  Before turning this in, your checkstyle run should show no issues.

## Prime Banana Passing Functionality

After the initial Ulam banana-passing sequence is completed, the first monkey (i.e. Monkey #1) should give the banana back to the ORIGINAL monkey. That monkey should then give the banana to the next lowest PRIME-numbered monkey.  This should continue until Monkey #2 gets the banana (2 being the smallest prime), who will then hand it off to the first monkey.

For example, for this sequence, assume that the first monkey to receive the banana is #24.  This monkey will pass the banana to Monkey #23, who will pass it to Monkey #19, from there to #17, from there to #13, from there to #11, from there to #7, from there to #5, from there to #3, from there to #2, and finally back to #1.

Note that the only non-prime monkeys which receive the banana will be (potentially) the monkey which starts the sequence and the first monkey.

The output for each individual monkey, including IDs, should be the same as in the previous deliverable.  The only thing that will change in the second sequence is the order in which the banana is passed.

You may use any algorithm you like to determine what the next-lowest prime value is.

See the sample_output.txt file in this directory for outputs for different numbers.  This shall be considered a truth copy of what the output for your code should be.

For any code you add, there should be at least two unit tests for each public method added or any methods whose signature was modified, _including_ any ones which do not return a value.  The only exception is very simple setters and getters.  At a bare minimum, at least EIGHT unit tests should be added, EVEN IF not that many methods have been modified.  This is in addition to the pinning tests created for your previous deliverable.

Note that these new tests are NOT pinning tests - they are traditional unit tests because there is no existing behavior.  We should check for expected behavior.

Finally, upload your modified code to GitHub or GitLab for me to examine.

For the summary, include a listing of how you went about fixing the code issues found by the static analysis tools, and any issues you experienced.  This should not be more than a few paragraphs.  You do not need to detail each individual issue discovered, but discuss general ideas.

Include screenshots of both the FINAL findbugs and checkstyle output.

## Format
Every assignment should have a title page with:
* The name of the student
* The title "CS 1632 - DELIVERABLE 5: Static Analysis"
* The URL for your git repository

There is no need to print out the code.  It should be available on GitHub or a similar code-sharing site BY THE BEGINNING OF CLASS.

## Grading
* Summary - 5%
* Prime Banana Passing Works Correctly - 30%
* Unit tests - 25%
* Screenshots of Findbugs and checkstyle output - 10%
* All issues from checkstyle and findbugs fixed - 30%

Please feel free to email me or come to office hours to discuss any problems you have. 
 
