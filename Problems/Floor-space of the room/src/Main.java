import java.util.Scanner;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        double a = 0;
        double b = 0;
        double c = 0;

        switch (word) {
            case "triangle" :
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle" :
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b);
                break;
            case "circle" :
                a = scanner.nextInt();
                System.out.println(a * a * 3.14);
                break;
            default:
                break;
        }
    }
}