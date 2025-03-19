public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання1");
        Phone mobila = new Phone();

        mobila.brand = "iPhone";
        mobila.model = "SE 2020";
        mobila.price = 1000;
        mobila.show(mobila.brand, mobila.model, mobila.price);

        System.out.println("\nЗавдання2");
        System.out.println("Додавання дробів:");
        int[] resultAdd = Fraction.addition(3, 4, 5, 6);
        Fraction.reductionFraction(resultAdd[0], resultAdd[1]);

        System.out.println("\nВіднімання дробів:");
        int[] resultSub = Fraction.subtraction(3, 4, 5, 6);
        Fraction.reductionFraction(resultSub[0], resultSub[1]);


        System.out.println("\nМноження дробів:");
        int[] resultMul = Fraction.multiplication(3, 4, 5, 6);
        Fraction.reductionFraction(resultMul[0], resultMul[1]);


        System.out.println("\nДілення дробів:");
        int[] resultDiv = Fraction.division(3, 4, 5, 6);
        Fraction.reductionFraction(resultDiv[0], resultDiv[1]);
    }
}