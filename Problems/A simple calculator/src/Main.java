import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        char ch = scanner.next().charAt(0);
        long y = scanner.nextLong();
        switch (ch) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '/':
                if (y != 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            case '*':
                System.out.println(x * y);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}