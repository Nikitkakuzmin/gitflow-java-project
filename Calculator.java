public class Calculator {
    private static final String VERSION = "1.0.0";

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Калькулятор v" + VERSION);
        System.out.println("Сумма: " + add(5, 3));
        System.out.println("Произведение: " + multiply(5, 3));
    }
}

