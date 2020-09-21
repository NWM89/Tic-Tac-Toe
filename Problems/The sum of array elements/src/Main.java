import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = 0;
        while (scanner.hasNext()) {
            number += scanner.nextInt();
        }
        System.out.println(number);
    }
}
