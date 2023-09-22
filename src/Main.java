public class Main {
    public static void main(String[] args) {

        double value1 = 100.00;
        double value2 = 50.00;
        double result = 0.00;
        char opCode = 'd';

        if(opCode == 'a') {
            result = value1 + value2;
        } else if(opCode == 's') {
            result = value1 - value2;
        } else if(opCode == 'm') {
            result = value1 * value2;
        } else if (opCode == 'd') {
            result = value1 / value2;
        } else {
            System.out.println("Invalid opCode " + opCode);
            result = 0.00;
        }

        System.out.println(result);
    }
}