/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        /* Read the command line arguments */
        final int M = Integer.parseInt(args[0]);
        final int N = Integer.parseInt(args[1]);
        final int K = Integer.parseInt(args[2]);
        /* Create the mn cells */
        boolean[][] mines = new boolean[M + 2][N + 2];
        /* Place the k mines uniformly among the mn cells */
        for (int i = 0; i < K; i++) {
            int randomRow;
            int randomColumn;
            do {
                randomColumn = (int) (Math.random() * mines[0].length);
            } while (randomColumn == 0 || randomColumn == mines[0].length - 1);
            do {
                randomRow = (int) (Math.random() * mines.length);
            } while (randomRow == 0 || randomRow == mines.length - 1);
            mines[randomRow][randomColumn] = true;
        }
        /* Count the number of neighboring mines */
        int[][] minesCount = new int[M + 2][N + 2];
        for (int i = 1; i < mines.length - 1; i++) {
            for (int j = 1; j < mines[i].length - 1; j++) {
                if (mines[i][j]) minesCount[i][j] = -1;
                else {
                    if (mines[i][j + 1]) minesCount[i][j]++;
                    if (mines[i][j - 1]) minesCount[i][j]++;
                    if (mines[i + 1][j]) minesCount[i][j]++;
                    if (mines[i + 1][j + 1]) minesCount[i][j]++;
                    if (mines[i + 1][j - 1]) minesCount[i][j]++;
                    if (mines[i - 1][j]) minesCount[i][j]++;
                    if (mines[i - 1][j + 1]) minesCount[i][j]++;
                    if (mines[i - 1][j - 1]) minesCount[i][j]++;
                }
            }
        }
        /* print the results */
        for (int i = 1; i < minesCount.length - 1; i++) {
            for (int j = 1; j < minesCount[i].length - 1; j++) {
                if (minesCount[i][j] == -1)
                    System.out.print("*  ");
                else
                    System.out.print(minesCount[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
