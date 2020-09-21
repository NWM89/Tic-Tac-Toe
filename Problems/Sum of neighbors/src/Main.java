import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        String temp = "";
        String temp2 = "";
        int n = 0;

        do {
            temp = scanner.nextLine();
            if (temp.compareTo("end") != 0) {
                s += temp + " ";
                n++;
                temp2 = temp;
            } else {
                break;
            }
        } while (temp.compareTo("end") != 0);

        String[] items = temp2.split(" ");
        String[] tempConvert = s.split(" ");
        int[][] matrix = new int[n][items.length];
        int[][] matrixModify = new int[n][items.length];
        int indexMatrix = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < items.length; j++) {
                matrix[i][j] = Integer.parseInt(tempConvert[indexMatrix]);
                indexMatrix++;
            }
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < items.length; j++) {
                matrixModify[i][j] = 0;
                try {
                    matrixModify[i][j] += matrix[i - 1][j];
                } catch (Exception e) {
                    matrixModify[i][j] += matrix[n - 1][j];
                }
                try {
                    matrixModify[i][j] += matrix[i + 1][j];
                } catch (Exception e) {
                    matrixModify[i][j] += matrix[0][j];
                }
                try {
                    matrixModify[i][j] += matrix[i][j - 1];
                } catch (Exception e) {
                    matrixModify[i][j] += matrix[i][items.length - 1];
                }
                try {
                    matrixModify[i][j] += matrix[i][j + 1];
                } catch (Exception e) {
                    matrixModify[i][j] += matrix[i][0];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < items.length; j++) {
                System.out.print(matrixModify[i][j] + " ");
            }
            System.out.println();
        }
    }
}