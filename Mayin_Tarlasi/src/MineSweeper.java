import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rows;
    private int columns;
    private int[][] mineField;
    private boolean[][] revealed;
    private int remainingCells;

    public MineSweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.mineField = new int[rows][columns];
        this.revealed = new boolean[rows][columns];
        this.remainingCells = rows * columns;

        initializeMineField();
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        while (true) {
            printMineField();

            System.out.print("Satır Giriniz: ");
            int row = input.nextInt();
            System.out.print("Sütun Giriniz: ");
            int column = input.nextInt();

            if (!isValidCell(row, column)) {
                System.out.println("Geçersiz bir hücre seçtiniz. Lütfen tekrar deneyin.");
                continue;
            }

            if (hasMine(row, column)) {
                revealMineField();
                printMineField();
                System.out.println("Game Over!!");
                break;
            }

            revealCell(row, column);

            if (remainingCells == countMines()) {
                revealMineField();
                printMineField();
                System.out.println("Oyunu Kazandınız!");
                break;
            }
        }
    }

    private void initializeMineField() {
        int totalMines = rows * columns / 4;
        Random random = new Random();

        for (int i = 0; i < totalMines; i++) {
            int row = random.nextInt(rows);
            int column = random.nextInt(columns);

            if (hasMine(row, column)) {
                i--;
                continue;
            }

            mineField[row][column] = -1;
            incrementAdjacentCells(row, column);
        }
    }

    private void incrementAdjacentCells(int row, int column) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (isValidCell(i, j) && !hasMine(i, j)) {
                    mineField[i][j]++;
                }
            }
        }
    }

    private boolean isValidCell(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    private boolean hasMine(int row, int column) {
        return mineField[row][column] == -1;
    }

    private void revealCell(int row, int column) {
        if (revealed[row][column]) {
            return;
        }

        revealed[row][column] = true;
        remainingCells--;

        if (mineField[row][column] == 0) {
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = column - 1; j <= column + 1; j++) {
                    if (isValidCell(i, j)) {
                        revealCell(i, j);
                    }
                }
            }
        }
    }

    private void revealMineField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                revealed[i][j] = true;
            }
        }
    }

    private int countMines() {
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mineField[i][j] == -1) {
                    count++;
                }
            }
        }

        return count;
    }

    private void printMineField() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (revealed[i][j]) {
                    if (hasMine(i, j)) {
                        System.out.print("* ");
                    } else {
                        System.out.print(mineField[i][j] + " ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = input.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int columns = input.nextInt();

        MineSweeper game = new MineSweeper(rows, columns);
        game.play();
    }
}
