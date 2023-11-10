/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        final int N = args.length - 1;
        int[] cumulativeSum = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) cumulativeSum[i] = Integer.parseInt(args[i + 1]);
            else cumulativeSum[i] = cumulativeSum[i - 1] + Integer.parseInt(args[i + 1]);
        }
        for (int i = 0; i < m; i++) {
            int index = 0;
            int r = (int) (Math.random() * cumulativeSum[N - 1]);
            while (r >= cumulativeSum[index]) {
                index++;
            }
            System.out.print(index + 1); // Print 1-based index
            if (i < m - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
