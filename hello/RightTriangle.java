/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        long num1 = Integer.parseInt(args[0]);
        long num2 = Integer.parseInt(args[1]);
        long num3 = Integer.parseInt(args[2]);
        boolean determinant = num1 > 0 && num2 > 0 && num3 > 0;
        boolean guess1 = (long) Math.sqrt(num1 * num1 + num2 * num2) == num3;
        boolean guess2 = (long) Math.sqrt(num1 * num1 + num3 * num3) == num2;
        boolean guess3 = (long) Math.sqrt(num2 * num2 + num3 * num3) == num1;
        boolean check = determinant && (guess1 || guess2 || guess3);
        System.out.println(check);
    }
}
