import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = new int[n][n];
        int value = 1;
        int minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1;
        
        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value++;
            }
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
