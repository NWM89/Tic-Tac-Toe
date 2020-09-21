import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        scanner.nextInt();
        int number2;
        int number3 = 0;
        int number4 = 0;
        number1 = scanner.nextInt();

        while (scanner.hasNext()) {
            number2 = scanner.nextInt();
            if (number2 == number1 + 1) {
                number3++;
            } else {
                number3 = 0;
            }
            if (number3 >= 2) {
                number4++;
            }
            number1 = number2;

        }
        System.out.println(number4);
    }
}