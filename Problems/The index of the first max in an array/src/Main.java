import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = scanner.nextInt();
        int maxIndx = 0;
        int curr;
        if (n >= 1) {
            for (int i = 1; i < n; i++) {
                curr = scanner.nextInt();
                if (max < curr) {
                    max = curr;
                    maxIndx = i;
                }
            }
        } else {
            maxIndx = 0;
        }


        System.out.println(maxIndx);
    }
}