import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        System.out.println(calculate());
    }
    static Map<String, Operations> map = new HashMap<>();
    static {
        map.put("+", Double::sum);
        map.put("-", (a, b) -> a - b);
        map.put("*", (a, b) -> a * b);
        map.put("/", (a, b) -> a / b);
    }
    private static double calculate(){
        double operand1 = Double.parseDouble(prompt("Enter first num: "));
        String operator = prompt("Enter math operation (+ - * /): ");
        double operand2  = Double.parseDouble(prompt("Enter second num: "));
        double result = map.get(operator).calculate(operand1, operand2);
        return result;
    }
    private static String prompt(String message) {
        System.out.print(message);
        return new Scanner(System.in).next();
    }
}