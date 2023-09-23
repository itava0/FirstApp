import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            for ( double currentResult : results) {
                System.out.println(currentResult);
            }
        } else if (args.length == 3) {
            handleCommandline(args);
        } else {
            System.out.println("Please provide an operation code and 2 numeric values");
        }

    }

    private static void handleCommandline(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    private static double execute(char opCode, double leftVal,double rightVal) {
        double results = switch (opCode) {
            case 'a' -> leftVal + rightVal;
            case 's' -> leftVal - rightVal;
            case 'm' -> leftVal * rightVal;
            case 'd' -> leftVal / rightVal;
            default -> {
                System.out.println("Invalid opCode: " + opCode);
                yield 0.0d;
            }
        };
        return results;
    }
}