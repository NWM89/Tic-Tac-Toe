import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int a;
        int b;
        boolean flag = true;
        a = scanner.nextInt();
        while (scanner.hasNext()) {
            b = scanner.nextInt();
            if (a > b || a == b) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
