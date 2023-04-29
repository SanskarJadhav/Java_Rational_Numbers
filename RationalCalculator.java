public class RationalCalculator {
    public static void main(String[] args) {
        try {
            String[] s1 = args[0].split("/");
            int num1 = Integer.parseInt(s1[0]);
            int num2 = Integer.parseInt(s1[1]);
            String[] s2 = args[1].split("/");
            int num3 = Integer.parseInt(s2[0]);
            int num4 = Integer.parseInt(s2[1]);
            RationalNumber rn1 = new RationalNumber(num1, num2);
            RationalNumber rn2 = new RationalNumber(num3, num4);

            System.out.println("Rational numbers entered: ");
            System.out.println("Num 1: " + rn1.toString());
            System.out.println("Num 2: " + rn2.toString());

            RationalNumber result = rn1.add(rn2);
            System.out.println("Sum: " + result.toString());

            result = rn1.subtract(rn2);
            System.out.println("Difference: " + result.toString());

            result = rn1.multiply(rn2);
            System.out.println("Product: " + result.toString());

            result = rn1.divide(rn2);
            System.out.println("Quotient: " + result.toString());

            System.out.println("Equality: " + rn1.equals(rn2));

            System.out.println("Float value of " + rn1 + ": " + rn1.toFloat());

            System.out.println("Float value of " + rn2 + ": " + rn2.toFloat());

            System.out.println("Absolute value of " + rn1 + ": " + rn1.abs());

            System.out.println("Absolute value of " + rn2 + ": " + rn2.abs());

        } catch (NumberFormatException e){
            System.out.println("Input is not an integer.");
        } catch (ZeroDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
