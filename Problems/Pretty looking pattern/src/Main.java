import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrix = new String[4];
        for (int i = 0; i < 4; i++) {
            matrix[i] = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i].charAt(j) == matrix[i].charAt(j + 1) 
                    && matrix[i + 1].charAt(j) == matrix[i + 1].charAt(j + 1) 
                    && matrix[i].charAt(j) == matrix[i + 1].charAt(j)) {
                    System.out.println("NO");
                    System.exit(0);
                }
                // if (matrix[i].substring(j, j + 1).compareTo(matrix[i + 1].substring(j, j + 1)) == 0) {
                //    System.out.println("NO");
                //    System.exit(0);
                //}
            }
        }
        System.out.println("YES");
    }
}
