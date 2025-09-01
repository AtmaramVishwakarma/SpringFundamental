class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorTest {   // Make this public since file name = CalculatorTest.java
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println("2 + 3 = " + result);
    }
}
