// Sanskar Jadhav AIML B1 PRN 21070126076
public class RationalCalculator {
    public static void main(String[] args) {
        try {
            // take string input and split values around /
            String[] s1 = args[0].split("/");
            // convert string to integer
            int num1 = Integer.parseInt(s1[0]);
            int num2 = Integer.parseInt(s1[1]);
            // repeat for the second rational number
            String[] s2 = args[1].split("/");
            int num3 = Integer.parseInt(s2[0]);
            int num4 = Integer.parseInt(s2[1]);
            // creating instances of RationalNumber class
            RationalNumber rn1 = new RationalNumber(num1, num2);
            RationalNumber rn2 = new RationalNumber(num3, num4);

            // display the rational numbers entered
            System.out.println("Rational numbers entered: ");
            System.out.println("Num 1: " + rn1.toString());
            System.out.println("Num 2: " + rn2.toString());

            // display the sum
            RationalNumber result = rn1.add(rn2);
            System.out.println("Sum: " + result.toString());

            // display the difference
            result = rn1.subtract(rn2);
            System.out.println("Difference: " + result.toString());

            // display the product
            result = rn1.multiply(rn2);
            System.out.println("Product: " + result.toString());

            // display the quotient
            result = rn1.divide(rn2);
            System.out.println("Quotient: " + result.toString());

            // display if the numbers are equal or not
            System.out.println("Equality: " + rn1.equals(rn2));

            // display the float value for each number
            System.out.println("Float value of " + rn1 + ": " + rn1.toFloat());
            System.out.println("Float value of " + rn2 + ": " + rn2.toFloat());

            // display the absolute value for each number
            System.out.println("Absolute value of " + rn1 + ": " + rn1.abs());
            System.out.println("Absolute value of " + rn2 + ": " + rn2.abs());
        } 
        // consider for if string cannot be parsed to int or other data type is entered
        catch (NumberFormatException e){
            System.out.println("Input is not an integer.");
        } 
        // display custom exception of zero denominator
        catch (ZeroDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
