public class ThueMorse {
    public static void main(String[] args) {
        final int M = Integer.parseInt(args[0]);
        final int N = Integer.highestOneBit(M) * 2;
        if (M == 1) {
            System.out.println("+");
            return;
        }
        boolean[] thueMorseArr = new boolean[N];
        thueMorseArr[1] = !thueMorseArr[0];
        for (int i = 2; i < thueMorseArr.length; i *= 2) {
            for (int j = i; j < i * 2; j++) {
                thueMorseArr[j] = !thueMorseArr[j - i];
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (thueMorseArr[i] == thueMorseArr[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}