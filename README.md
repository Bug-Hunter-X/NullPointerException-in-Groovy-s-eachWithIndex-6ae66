# Groovy NullPointerException in eachWithIndex

This repository demonstrates a common error in Groovy when using the `eachWithIndex` method with lists containing null values.  The `eachWithIndex` method does not automatically handle null elements; if a null element is encountered while accessing its properties or calling methods on it, a `NullPointerException` will occur.

The `bug.groovy` file showcases the problem. The `bugSolution.groovy` file demonstrates a solution to detect and handle null values gracefully within the loop, preventing the `NullPointerException`.

## How to reproduce
1. Clone this repository.
2. Run `bug.groovy`.  Observe the `NullPointerException`.
3. Run `bugSolution.groovy`. Observe the correct handling of null values.

## Solution
The solution involves explicitly checking for null values within the `eachWithIndex` loop and handling them appropriately. This prevents the exception and allows the code to continue processing other elements of the list.