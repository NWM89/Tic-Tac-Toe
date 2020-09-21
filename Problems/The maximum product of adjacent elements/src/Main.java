import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = scanner.nextInt();
        }
        int[] arrnModified = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            try {
                arrnModified[i] = arrN[i] * arrN[i + 1];
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int max = arrnModified[0];
        for (int i = 2; i < n; i = i + 1) {
            if (max < arrnModified[i]) {
                max = arrnModified[i];
            }
        }
        System.out.println(max);
    }
}