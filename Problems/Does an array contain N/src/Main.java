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
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arrN[i] == chk) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}