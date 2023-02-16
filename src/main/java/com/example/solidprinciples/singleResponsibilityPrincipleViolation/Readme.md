### What's wrong?

Look at the AreaCalculator.
We are clearly violating Single Responsibility Principle.
AreaCalculator class clearly does many things. It calculates the sum of the area, print sum in JSON and CSV

### How to fix?
Write a separate class for printing areas `AreaPrinter` and handover the printing jobs to it.