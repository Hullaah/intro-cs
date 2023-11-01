public class Birthday {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        final int TRIALS = Integer.parseInt(args[1]);
        int[] peopleInRoom = new int[N + 2];

        for (int i = 0; i < TRIALS; i++) {
            boolean[] birthday = new boolean[N];
            int r = (int) (Math.random() * N);
            int count = 0;
            while (!birthday[r]) {
                count++;
                birthday[r] = true;
                r = (int) (Math.random() * N);
            }
            peopleInRoom[count] += 1;
        }
        int i = 0;
        double fraction = 0;
        do {
            for (int j = 0; j <= i; j++) fraction += peopleInRoom[j];
            fraction /= TRIALS;
            System.out.println(i + 1 + "\t" + peopleInRoom[i] + "\t" + fraction);
            i++;
        } while (fraction < 0.5);
    }
}