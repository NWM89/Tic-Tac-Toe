import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[] maxMatrix = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                if (i == 0 && j == 0) {
                    maxMatrix[0] = matrix[i][j];
                    maxMatrix[1] = i;
                    maxMatrix[2] = j;
                } else {
                    if (maxMatrix[0] < matrix[i][j]) {
                        maxMatrix[0] = matrix[i][j];
                        maxMatrix[1] = i;
                        maxMatrix[2] = j;
                    }
                }
            }
        }
        System.out.println(maxMatrix[1] + " " + maxMatrix[2]);
    }
}