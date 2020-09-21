import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrN = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                arrN[i] = scanner.nextInt();
            } else {
                arrN[0] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrN[i] + " ");
        }
    }
}