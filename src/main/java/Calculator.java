public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));
        System.out.println(calculator.subtract(5, 3));
        System.out.println(calculator.multiply(5, 3));
        System.out.println(calculator.divide(5, 3));
    }
}
