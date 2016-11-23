# CS 1632 Midterm 2 Study Guide
Fall 2016

Reminder: the second midterm is December 8th!

Note that the second midterm is _not_ cumulative, except in the sense that the topics covered in the second half of the semester depend on understanding of the more fundamental concepts taught in the beginning of the course.

## WEB TESTING
* Be able to explain how you would test a web page with Selenium
* Understand how you should NOT test a web page
* Understand possible problems with testing a web page
* You do NOT need to know Selenese (Selenium scripting language)
* Understand basic usage of Selenium with JUnit (driver, WebElement, etc.)

## PROPERTY-BASED TESTING
* Be able to write simple property-based tests
* Be able to name invariants given a function and sample input/output
* Be able to show how invariants are broken
* Understand what shrinking is and be able to provide an example
* What is property-based testing good for?  What is it bad for?

## FORMAL VERIFICATION
* Understand what it is
* Know what the benefits and drawbacks are

## PERFORMANCE TESTING
* Understand concepts on how to test performance
* Be able to write test plans for different performance indicators and systems
* Terminology: Service-Oriented vs Efficiency-Oriented Indicators
* Availability, Response Time, Throughput, Utilization
* Performance targets, performance thresholds, KPIs - understand and be able to generate!
* Measuring response time - methodologies
* Understand different concepts of time: user, system, total, real
* Measuring availability, concurrency, scalability, throughput
* Understand n 9's (e.g., 5 9s vs 6 9s)
* Load testing - baseline, soak/stability, stress tests
* When to use a profiler

## SECURITY TESTING
* The CIA/InfoSec Triad
* Terminology: passive vs active,  public-key cryptography, vulnerability, exploit
* Terminology: interruption, interception, modification, fabrication
* Be able to describe/test for common attacks: injection, broken authentication, XSS, insecure storage, buffer overruns, security misconfiguration, insecure object references, social engineering
* How does security testing differ from other kinds of testing?

## STATIC ANALYSIS
* Understand static vs dynamic testing
* Understand limitations of static testing
* Know different kinds of static analysis, and tools and methods used (e.g. linters, bug finders, code coverage, code metrics, code reviews)

## INTERACTING WITH STAKEHOLDERS
* Be able to name some stakeholders and what is important to them (upper management, project management, testers, other developers)
* Be prepared for some "fake" interaction with various stakeholders
* Be able to put together a red-yellow-green template report
* Know the one most important thing when dealing with stakeholders or other co-workers

## Testing Strategy
* Understand the testing pyramid
* Understand common anti-patterns (ice cream cone, cupcake)
* Given a description of a program, be able to develop your own testing strategy

## BEHAVIOR-DRIVEN DEVELOPMENT
* Understand the differences between TDD (UTDD), ATDD, and BDD
* Understand the differences between user stories and traditional requirements
* Know how to write user stories using the Connextra template
* Know how to write scenarios using the Given/When/Then template
* Know the benefits and drawbacks of TDD vs BDD, and when either would be a better fit