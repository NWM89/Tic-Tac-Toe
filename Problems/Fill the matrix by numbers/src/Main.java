import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = i;
            for (int j = 0; j < n; j++) {
                System.out.print(Math.abs(temp - j) + " ");
            }
            System.out.println();
        }
    }
}