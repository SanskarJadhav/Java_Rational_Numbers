public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) throws ZeroDenominatorException {
        if (denominator == 0) {
            throw new ZeroDenominatorException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public RationalNumber add(RationalNumber other) throws ZeroDenominatorException {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) throws ZeroDenominatorException {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber other) throws ZeroDenominatorException {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber other) throws ZeroDenominatorException {
        if (other.numerator == 0) {
            throw new ZeroDenominatorException();
        }
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public boolean equals(RationalNumber other) {
        return numerator == other.numerator && denominator == other.denominator;
    }

    public float toFloat() {
        return (float)numerator/denominator;
    }

    public RationalNumber abs() throws ZeroDenominatorException {
        return new RationalNumber(Math.abs(numerator), Math.abs(denominator));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
