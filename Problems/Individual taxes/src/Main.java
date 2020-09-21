import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dohod = new int[n];
        for (int i = 0; i < n; i++) {
            dohod[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            dohod[i] = dohod[i] * scanner.nextInt();
        }
        int maxDohod = dohod[0];
        int indxDohod = 1;
        for (int i = 0; i < n; i++) {
            if (maxDohod < dohod[i]) {
                maxDohod = dohod[i];
                indxDohod = i + 1;
            }
        }
        System.out.println(indxDohod);
    }
}