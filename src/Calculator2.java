public class Calculator2 {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Calculator calc = new Calculator();
        int a=10;
        int b=5;
        System.out.println("add=" + calc.add(a,b));
        System.out.println("subtract=" + calc.subtract(a,b));
        System.out.println("multiply=" + calc.multiply(a,b));
        System.out.println("divide=" + calc.divide(a,b));
    }
}
