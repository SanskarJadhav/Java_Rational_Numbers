public class RationalNumber {
    // declaring private variables numerator and denominator
    private int numerator;
    private int denominator;
    
    // parameterised constructor with zero denominator exception
    public RationalNumber(int numerator, int denominator) throws ZeroDenominatorException {
        if (denominator == 0) {
            throw new ZeroDenominatorException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    // reduce the fractions using greatest common divisor
    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // method to add two rational numbers
    public RationalNumber add(RationalNumber other) throws ZeroDenominatorException {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // method to subtract two rational numbers
    public RationalNumber subtract(RationalNumber other) throws ZeroDenominatorException {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // method to multiply two rational numbers
    public RationalNumber multiply(RationalNumber other) throws ZeroDenominatorException {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // method to divide two rational numbers
    // considers exception when numerator of second number is 0
    public RationalNumber divide(RationalNumber other) throws ZeroDenominatorException {
        if (other.numerator == 0) {
            throw new ZeroDenominatorException();
        }
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // method to compare if two rational numbers are equal
    public boolean equals(RationalNumber other) {
        return numerator == other.numerator && denominator == other.denominator;
    }

    // method to convert rational number to float
    public float toFloat() {
        return (float)numerator/denominator;
    }

    // method to get absolute value of rational number
    public RationalNumber abs() throws ZeroDenominatorException {
        return new RationalNumber(Math.abs(numerator), Math.abs(denominator));
    }

    // private method for calculating gcd
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // method to display rational number
    public String toString() {
        return numerator + "/" + denominator;
    }
}
