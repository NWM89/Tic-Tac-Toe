import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n * n][n * n];

        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int temp1 = 0;
        int temp2 = 0;
        int sum = getSum(n);

        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                temp1 += matrix[i][j];
                temp2 += matrix[j][i];
            }

            getAnswer(temp1, sum);
            getAnswer(temp2, sum);
            temp1 = 0;
            temp2 = 0;
        }

        for (int i = 0; i < n * n; i += n) {
            for (int j = 0; j < n * n; j += n) {
                for (int x = i; x < i + n; x++) {
                    for (int y = j; y < j + n; y++) {
                        temp2 += matrix[x][y];
                    }
                }
                getAnswer(temp2, sum);
                temp2 = 0;
            }
        }
        System.out.println("YES");
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n * n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void getAnswer(int temp, int sum) {
        if (temp != sum) {
            System.out.println("NO");
            System.exit(0);
        }
    }
}