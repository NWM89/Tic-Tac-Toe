package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter cells: ");
        String word = "_________";
        char[][] wordMatrix;
        wordMatrix = convertToMatrix(word);

        printMatrix(wordMatrix);
        int x = 0;
        int y = 0;
        boolean flagNext = false;

        do {
            System.out.print("Enter the coordinates: ");
            try {
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;

                if (x > 2 || y > 2) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    if (checkCoordinates(wordMatrix, x, y)) {
                        if (!flagNext) {
                            wordMatrix[x][y] = 'X';
                            flagNext = true;
                        } else {
                            wordMatrix[x][y] = 'O';
                            flagNext = false;
                        }

                        //break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.next();
                x = 0;
                y = 0;
            }
            printMatrix(wordMatrix);
            //checkImpossible(word);
            checkWins(wordMatrix);
            checkDraw(wordMatrix);
            //checkNotFinished(word);
            //wordMatrix = AIStroke(wordMatrix);
        } while (x >= 0);


        printMatrix(wordMatrix);

        //inputUserCoord();


        //checkImpossible(word);
        //checkWins(word);
        //checkDraw(word);
        //checkNotFinished(word);

        //System.out.println("Impossible");
    }

    public static void checkWins(char[][] wordMatrix) {
        String word = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                word += wordMatrix[i][j];
            }
        }

        String temp = " ";

        for (int i = 0; i <= 6; i += 3) {
            temp = word.substring(i,i + 3);
            getCompared(temp);
        }

        for (int i = 0; i <= 2; i++) {
            temp = word.charAt(i) + "" + word.charAt(i + 3) + "" + word.charAt(i + 6);
            getCompared(temp);
        }

        temp = word.charAt(0) + "" + word.charAt(4) + "" + word.charAt(8);
        getCompared(temp);

        temp = word.charAt(2) + "" + word.charAt(4) + "" + word.charAt(6);
        getCompared(temp);
    }

    public static void checkDraw(char[][] wordMatrix) {
        String word = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                word += wordMatrix[i][j];
            }
        }

        if (word.compareTo("XOXOOXXXO") == 0) {
            System.out.println("Draw");
            System.exit(0);
        }
    }

    public static void checkNotFinished(String word) {
        int[] calcXo = new int[2];
        calcXo = calcXO(word);
        if (calcXo[0] < 4 && calcXo[1] != 4) {
            System.out.println("Game not finished");
            System.exit(0);
        } else {
            if (calcXo[1] < 4 && calcXo[0] != 4) {
                System.out.println("Game not finished");
                System.exit(0);
            }
        }
    }

    public static void checkImpossible(String word) {
        String[] temp = new String[3];
        int index = 0;
        int[] calcXo = new int[2];
        calcXo = calcXO(word);
        if (Math.abs(calcXo[0] - calcXo[1]) > 1) {
            System.out.println("Impossible");
            System.exit(0);
        }

        for (int i = 0; i <= 6; i += 3) {
            temp[index] = word.substring(i,i + 3);
            index++;
        }

        getMessageImpossible(temp);

        index = 0;
        for (int i = 0; i <= 2; i++) {
            temp[index] = word.charAt(i) + "" + word.charAt(i + 3) + "" + word.charAt(i + 6);
            index++;
        }

        getMessageImpossible(temp);
    }

    public static void getWins(char symbol) {
        System.out.println(symbol + " wins");
        System.exit(0);
    }

    public static void getCompared(String temp) {
        if (temp.compareTo("XXX") == 0) {
            getWins('X');
        } else {
            if (temp.compareTo("OOO") == 0) {
                getWins('O');
            }
        }
    }

    public static void getMessageImpossible(String[] temp) {
        if (temp[0].equals("XXX") && temp[1].equals("OOO") ||
                temp[0].equals("OOO") && temp[1].equals("XXX") ||
                temp[1].equals("XXX") && temp[2].equals("OOO") ||
                temp[1].equals("OOO") && temp[2].equals("XXX")) {
            System.out.println("Impossible");
            System.exit(0);
        }
    }

    public static int[] calcXO(String word) {
        int x = 0;
        int o = 0;
        for (int i = 0; i < 9; i++) {
            if (word.charAt(i) == 'O') {
                o++;
            } else {
                if (word.charAt(i) == 'X') {
                    x++;
                }
            }
        }
        int[] calc = new int[2];
        calc[0] = x;
        calc[1] = o;
        return calc;
    }

    /* public static int[] inputUserCoord() {
        Scanner scanner = new Scanner(System.in);
        int[] coord = new int[2];
        System.out.println("Enter the coordinates: ");
        coord[0] = scanner.nextInt();
        coord[1] = scanner.nextInt();
        return coord;
    } */

    public static boolean checkCoordinates(char[][] charMatrix, int x, int y) {
        boolean checkCoord = false;
        try {
            if (charMatrix[x][y] == ' ') {
                checkCoord = true;
            }
        } finally {

        }
        return checkCoord;
    }

    public static char[][] convertToMatrix(String word) {
        char[][] wordMatrix = new char[3][3];
        int charIndex = 0;
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                if (word.charAt(charIndex) == '_') {
                    wordMatrix[j][i] = ' ';
                } else {
                    wordMatrix[j][i] = word.charAt(charIndex);
                }
                charIndex++;
            }
        }
        return wordMatrix;
    }

    public static void printMatrix(char[][] wordMatrix) {
        System.out.println("---------");
        for (int i = 2; i >= 0; i--) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(wordMatrix[j][i] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    public static char[][] AIStroke(char[][] wordMatrix) {
        boolean flag = false;
        int x;
        int y;
        do {
            x = (int)(Math.random() * 2 + 1);
            y = (int)(Math.random() * 2 + 1);
            if (checkCoordinates(wordMatrix, x, y)) {
                flag = true;
            }
        } while (flag = false);
        wordMatrix[x][y] = 'O';
        return wordMatrix;
    }

}
