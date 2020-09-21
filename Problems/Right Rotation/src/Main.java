import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        n = n % s.length;
        if (n == 0) {
            n = s.length;
        }

        String temp;

        for (int i = 0; i < n; i++) {
            if (s.length - 1 >= 0) {
                temp = s[s.length - 1];
                System.arraycopy(s, 0, s, 1, s.length - 1);
                s[0] = temp;
            }
        }

        for (String value : s) {
            System.out.print(value + " ");
        }
    }
}