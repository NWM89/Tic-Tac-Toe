import java.util.*;

public class Main {

    private static int iteration = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] boxA = new int[3];
        int[] boxB = new int[3];

        for (int i = 0; i < 3; i++) {
            boxA[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            boxB[i] = scanner.nextInt();
        }
        testBoxes(boxA, boxB);
    }

    public static int testBoxes(int[] initBox) {
        if (initBox[0] == 1 && initBox[1] == 1 && initBox[2] == 1) {
            return 1;
        } else {
            if (initBox[0] == 2 && initBox[1] == 2 && initBox[2] == 2) {
                return 2;
            }
        }
        return 0;
    }

    public static void iterationPlus() {
        if (iteration > 3) {
            System.out.println("Incompatible");
            System.exit(0);
        } else {
            iteration++;
        }
    }

    public static void testBoxes(int[] boxA, int[] boxB) {
        int[] initBox = new int[3];

        for (int i = 0; i < 3; i++) {
            if (boxA[i] > boxB[i]) {
                initBox[i] = 1;
            } else {
                if (boxA[i] < boxB[i]) {
                    initBox[i] = 2;
                }
            }
        }

        if (testBoxes(initBox) == 1) {
            System.out.println("Box 1 > Box 2");
            System.exit(0);
        } else {
            if (testBoxes(initBox) == 2) {
                System.out.println("Box 1 < Box 2");
                System.exit(0);
            } else {
                int temporary;
                if (iteration == 3) {
                    temporary = boxA[0];
                    boxA[0] = boxA[2];
                    boxA[2] = temporary;
                    iterationPlus();
                } else {
                    temporary = boxA[0];
                    boxA[0] = boxA[1];
                    boxA[1] = boxA[2];
                    boxA[2] = temporary;
                    iterationPlus();
                }
                testBoxes(boxA, boxB);
            }
        }
    }
}