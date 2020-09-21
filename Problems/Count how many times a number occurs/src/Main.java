import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = scanner.nextInt();
        }
        int chk = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < n; i++) {
            if (arrN[i] == chk) {
                summ++;
            }
        }
        System.out.println(summ);
    }
}