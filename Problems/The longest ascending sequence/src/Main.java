import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrN = new int[n];
        int count = 1;
        int countMax = 0;
        for (int i = 0; i < n; i++) {
            arrN[i] = scanner.nextInt();
            if (i > 0) {
                if (arrN[i - 1] < arrN[i]) {
                    count++;
                } else {
                    if (countMax < count) {
                        countMax = count;
                        count = 1;
                    }
                }
            }
        }
        if (countMax < count) {
            countMax = count;
        }
        System.out.println(countMax);


    }
}