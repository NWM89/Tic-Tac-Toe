import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrN = new int[n];
        
        for (int i = 0; i < n; i++) {
            arrN[i] = scanner.nextInt();
        }
        
        int[] comp = new int[2];
        
        comp[0] = scanner.nextInt();
        comp[1] = scanner.nextInt();
        
        boolean flag = false;
        int first = 0;
        int tempIndx = 0;
        
        for (int i = 0; i < n; i++) {
            if (!flag) {
                if (arrN[i] == comp[0]) {
                    first = 1;
                    tempIndx = i;
                    flag = true;
                } else {
                    if (arrN[i] == comp[1]) {
                        first = 2;
                        tempIndx = i;
                        flag = true;
                    }
                }
            } else {
                switch (first) {
                    case 1: if (arrN[i] == comp[1] && tempIndx == i - 1) {
                            flag = true;
                            break;
                        }
                        flag = false;
                        break; 
                        
                    case 2: if (arrN[i] == comp[0] && tempIndx == i - 1) {
                            flag = true;
                            break;
                        }
                        flag = false;
                        break;

                    default: flag = false;
                        break;
                }
            }
            if (tempIndx == i && tempIndx == n--) {
                flag = false;
            }

        }

        System.out.println(flag);

    }
}
