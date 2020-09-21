import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        int iBeg = 0;
        int iFin = 0;
        int jBeg = 0;
        int jFin = 0;

        int k = 1;
        int i = 0;
        int j = 0;

        while (k <= n * n) {
            matrix[i][j] = k;
            if (i == iBeg && j < n - jFin - 1) {
                ++j;
            } else {
                if (j == n - jFin - 1 && i < n - iFin - 1) {
                    ++i;
                } else {
                    if (i == n - iFin - 1 && j > jBeg) {
                        --j;
                    } else {
                        --i;
                    }
                }
            }
            if (i == iBeg + 1 && j == jBeg && jBeg != n - jFin - 1) {
                ++iBeg;
                ++iFin;
                ++jBeg;
                ++jFin;
            }
            ++k;
        }

        for (int u = 0; u < n; u++) {
            for (int o = 0; o < n; o++) {
                System.out.print(matrix[u][o] + " ");
            }
            System.out.println();
        }
    }
}