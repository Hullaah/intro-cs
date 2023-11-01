public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x, y;
        int manhattanDistance;
        double steps = 0;

        for (int i = 0; i < trials; i++) {
            int direction;
            x = 0;
            y = 0;
            manhattanDistance = 0;
            while (manhattanDistance != r) {
                direction = (int) (Math.random() * 4);
                if (direction == 0) y += 1;
                else if (direction == 1) y -= 1;
                else if (direction == 2) x += 1;
                else if (direction == 3) x -= 1;
                steps++;
                manhattanDistance = Math.abs(x) + Math.abs(y);
            }
        }
        System.out.printf("average number of steps = %f\n", steps / trials);
    }
}
