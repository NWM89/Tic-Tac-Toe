import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = s.length;
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            if (s[i].length() < s[i + 1].length() || s[i].compareTo(s[i + 1]) <= 0) {
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}