public class EjercicioUno {

    public static void main(String[] args) {
    }

    public static void printNumbers(int firstNumber, int secondNumber) {
        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber += 1;
        }
    }

    public static void printEvenNumbers(int firstNumber, int secondNumber) {
        while (firstNumber <= secondNumber) {
            if (firstNumber % 2 == 0) {
                System.out.println(firstNumber);
                firstNumber += 1;
            }
            firstNumber += 1;
        }
    }

    public static void printNumberss(int firstNumber, int secondNumber, String oddOrEven) {
        while (firstNumber <= secondNumber) {
            if (oddOrEven.equals("Even")) {
                if (firstNumber % 2 == 0) {
                    System.out.println(firstNumber);
                    firstNumber += 1;
                }
            } else {
                if (firstNumber % 2 != 0) {
                    System.out.println(firstNumber);
                    firstNumber += 1;
                }
            }
            firstNumber += 1;
        }
    }

    public static void printEvenNumberss(int firstNumber, int secondNumber) {
        for (int i = secondNumber; i >= firstNumber; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

