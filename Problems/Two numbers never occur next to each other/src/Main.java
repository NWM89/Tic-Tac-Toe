import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arrN = new int[a];
        for (int i = 0; i < a; i++) {
            arrN[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < a - 1; i++) {
            if (arrN[i] == n && arrN[i + 1] == m) {
                System.out.println("false");
                System.exit(0);

            } else {
                if (arrN[i] == m && arrN[i + 1] == n) {
                    System.out.println("false");
                    System.exit(0);
                }
            }
        }
        System.out.println("true");

    }
}