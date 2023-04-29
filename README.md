# Java_Rational_Numbers
In this program, the user can enter two rational numbers and the following operations are performed:
- addition
- subtraction
- multiplication
- division
- comparison for equality
- conversion to float value
- display absolute value

The program runs with greater efficiency by creating a parameterised constructor in the class RationalNumber, wherein the fractions are reduced using the greatest common divisor before any operations are performed.

The numbers are entered through the command line and can be entered as n1/n2 n3/n4, where n1 and n2 are the numerator and denominator for the first rational number, and n3 and n4 are the numerator and denominator for the second rational number respectively.

The program also considers two exceptions:
1. NumberFormatException - in case the user enters a value that is not an integer, to handle incorrect parsing to integer
2. ZeroDenominatorException - this is a custom exception that handles division by 0 error
