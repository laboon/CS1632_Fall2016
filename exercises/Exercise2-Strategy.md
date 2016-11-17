# Exercise 2 - Strategy

You are the new Director of Quality Assurance for Limaxter, the world's first and only social networking site for slug afficionados.  Although the company has been around for several years, with the recent upsurge in slug-related news sites, it has only been for the last several months that the number of users has started to increase dramatically.  This upsurge has shown that several parts of the system are failing on a regular basis, and several security flaws have allowed users to change the favorite slugs of other users.

Limaxter Architecture:

```
[ Front-End Rails App] <--> [Java Backend] ---> [Analytics / Frege]
                                |
                                \--> [Scala database interface]				
```
Limaxter is written in several JVM-based languages (Java backend, database in Scala, analytics in Frege), as well as a Ruby on Rails app (Front-End Rails App, or FERA).  

Information stored on the user includes username, password, favorite species of slugs, and various pictures of slugs which users have uploaded.  No financial or education information is stored.

Occasional database failures have corrupted data in the database, requiring a backup to be restored.  Backup snapshots are taken once per hour.

Analytics will occasionally not keep up with the number of users.  In this case, the entire Analytics app will shut down.  At this point, Limaxter's marketing team has no idea how users are accessing the app, or how many.  This is directly detrimental to Limax's bottom line.

There is currently no automated test suite or QA team.  The early engineers said that "we don't need tests".  Many of these early engineers are still on the team.  Occasionally they will manually run some informal tests, but there are no test plans.

The CEO and CMO have been asking for additional features to handle fans of other mollusks aside from slugs.

It looks like even without additional features, your site will be experiencing an exponential amount of growth.

You are allocated enough money to hire two senior QA engineers, one senior and two junior, or three junior QA engineers.

What will be your recommendations?  How will you convince the engineers, CEOs, and your new QA team?  Where will be your focus?  What kind of tools will you use to determine problems?  Where do you think your focus should be?  What kind of team should you hire, and why?
