import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int min = scanner.nextInt();
        int curr;
        while (scanner.hasNext()) {
            curr = scanner.nextInt();
            if (min > curr) {
                min = curr;
            }
        }
        System.out.println(min);
    }
}