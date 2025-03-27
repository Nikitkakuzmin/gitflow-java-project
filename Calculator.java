public class Calculator {
    private static final String VERSION = "1.0.1";

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Ошибка! Деление на ноль.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Калькулятор v" + VERSION);
        System.out.println("Сумма: " + add(5, 3));
        System.out.println("Произведение: " + multiply(5, 3));
        System.out.println("Деление: " + divide(10, 0));
    }
}
