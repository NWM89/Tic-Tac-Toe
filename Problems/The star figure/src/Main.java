import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '.';
            }
        }

        for (int i = 0; i < n; i++) {
            matrix[i][i] = '*';
            matrix[n - i - 1][i] = '*';
            matrix[i][Math.round(n / 2)] = '*';
            matrix[Math.round(n / 2)][i] = '*';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}