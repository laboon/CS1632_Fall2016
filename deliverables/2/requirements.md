## CitySim9003 Requirements

FUN-CITY-LOCS. The program shall simulate a city with four locations: Hotel, Diner, Library, and Coffee.

FUN-OUTSIDE-CITY. A fifth location, Outside City, shall stand for a driver outside the city limits.

FUN-AVENUES. The city shall have two one-way avenues, Fourth Ave and Fifth Ave.  Fourth Ave shall connect, in order, Outside City -> Hotel -> Diner -> Outside City.  Fifth Ave shall connect, in order, Outside City -> Coffee -> Library -> Outside City.

FUN-STREETS. The city shall have two two-way streets, Bill St. and Phil St.  Bill St. shall connect Hotel and Library.  Phil St. shall connect Diner and Coffee.

FUN-FIVE-DRIVERS. Five drivers, numbered 1 through 5, shall traverse the city, one after the other.

FUN-COFFEE-COUNT. At the end of each drive, the simulation shall print out how many times that driver visited Coffee.  The format shall be "Driver `n` got `x` cup(s) of coffee.", where `n` is the driver number (1 through 6) and `x` is the number of times that the driver visited the Coffee location.  If a driver starts on the Coffee location, this counts as a time visiting the coffee shop.  This shall be the last line printed out for each iteration.

FUN-START-LOC. A driver may start in any of the four locations listed in FUN-CITY-LOCS.  Drivers may not start outside of the city.

FUN-ITERATION. At each iteration, a Driver will drive from the current Location to one of the possible Locations that can be reached from the original Location.  The decision shall be made pseudorandomly based on a seed passed in from the command line, as covered by FUN-ARGS.

FUN-END. The simulation shall end if a Driver encounters the Outside City Location and it is not the first iteration of the simulation.  If it is the first iteration of the simulation, behavior is covered by FUN-FIRST-LOC.

FUN-ARGS. The system shall accept an integer seed from the command line for the pseudorandom number generator.  No other arguments shall be accepted.  If no arguments are provided,  more than one argument is provided, or the single argument is not an integer, the system shall inform the user and exit.

FUN-OTHER-CITIES. If a driver exits the city via Fourth Avenue (that is, goes to the Outside City location past the Diner), then the program shall display that the driver has gone to Philadelphia.  If a driver exits the city via Fifth Avenue (that is, goes to the Outside City location past the Library), then the program shall display that the driver has gone to Cleveland.

It may be easier to understand the map of the city visually.

```
City Map
	
                ---> [Hotel] ----> [Diner] ----> Fourth Ave. (to Philadelphia)
                      A  |          A  |
              Bill St.|  |          |  | Phil St.
                      |  V          |  V
 (to Cleveland) <--- [Library] <-- [Coffee] <--- Fifth Ave.
```	
