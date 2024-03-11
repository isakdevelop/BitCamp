package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

enum Operator   {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private String operator;
    private BiFunction<Double, Double, Double> expression;

    Operator(String operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static double calculate(String operator, double num1, double num2) {
        return getOperator(operator).expression.apply(num1, num2);
    }

    private static Operator getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}

public class Calculator {

    double calculate(double a, String operator, double b) {
        return Operator.calculate(operator, a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("점수, 연산자, 점수");
        double d = c.calculate(sc.nextInt(),sc.next(), sc.nextInt());
        System.out.println("Result : " + d);
    }
}

