package Calculator;

import java.util.Scanner;
//TODO call class in a loop for continuous calculations
public class Calculadora {

    public static int calculator(){

        Scanner scanner = new Scanner(System.in);
        //TODO check for more complexity
        String input = scanner.nextLine().trim().replace(" ", "");


        String[] operators = {"*", "+", "-", "/"};
        String[] equation = input.split("\\D+"); // \\D+ is working , but I don't feel confident with that
        int first = Integer.parseInt(equation[0]);
        int last = Integer.parseInt(equation[1]);

        //TODO create methods for each operator
        for (String operator : operators) {

            if (input.contains(operator)) {

                switch (operator) {
                    case "*" -> {
                        return first * last;
                    }
                    case "+" -> {
                        return first + last;
                    }
                    case "-" -> {
                        return first - last;
                    }
                    case "/" -> {
                        return first / last;

                    }
                    default -> {
                        return -1;
                    }
                }
            }

        }
        return 666;
    }
}
