public class ThueMorse {
    public static void main(String[] args) {
        int k = 1;
        while (k < Integer.parseInt(args[0])) k *= 2;
        final int N = k;
        boolean[] thueMorseArr = new boolean[N];
        thueMorseArr[1] = !thueMorseArr[0];
        for (int i = 2; i < thueMorseArr.length; i *= 2) {
            for (int j = i; j < i * 2; j++) {
                thueMorseArr[j] = !thueMorseArr[j - i];
            }
        }
        for (int i = 0; i < thueMorseArr.length; i++) {
            for (int j = 0; j < thueMorseArr.length; j++) {
                if (thueMorseArr[i] == thueMorseArr[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}