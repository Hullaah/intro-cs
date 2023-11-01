public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int manhattanDistance = 0;
        int steps = 0;
        int direction;

        System.out.printf("(%d, %d)\n", x, y);
        while (manhattanDistance != r) {
            direction = (int) (Math.random() * 4);
            if (direction == 0) y += 1;
            else if (direction == 1) y -= 1;
            else if (direction == 2) x += 1;
            else if (direction == 3) x -= 1;
            System.out.printf("(%d, %d)\n", x, y);
            steps++;
            manhattanDistance = Math.abs(x) + Math.abs(y);
        }
        System.out.printf("steps = %d\n", steps);
    }
}
