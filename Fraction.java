public class Fraction {
    public static int[] addition(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator = numerator1 * denominator2 + numerator2 * denominator1;
        int newDenominator = denominator1 * denominator2;
        return new int[]{newNumerator, newDenominator};
    }

    public static int[] subtraction(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator = numerator1 * denominator2 - numerator2 * denominator1;
        int newDenominator = denominator1 * denominator2;
        return new int[]{newNumerator, newDenominator};
    }

    public static int[] multiplication(int numerator1, int denominator1, int numerator2, int denominator2) {
        int newNumerator = numerator1 * numerator2;
        int newDenominator = denominator1 * denominator2;
        return new int[]{newNumerator, newDenominator};
    }

    public static int[] division(int numerator1, int denominator1, int numerator2, int denominator2) {
        if (numerator2 == 0) {
            System.out.println("Ділення на нуль неможливе");
            return new int[]{0, 1};
        }
        int newNumerator = numerator1 * denominator2;
        int newDenominator = denominator1 * numerator2;
        return new int[]{newNumerator, newDenominator};
    }

    public static void reductionFraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        if (gcd != 1) {
            numerator /= gcd;
            denominator /= gcd;
            System.out.println("Ваш дріб після скорочення: " + numerator + "/" + denominator);
        } else {
            System.out.println("Ваш дріб: " + numerator + "/" + denominator);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}