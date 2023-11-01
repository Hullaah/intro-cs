/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double phi1 = Math.toRadians(x1);
        double phi2 = Math.toRadians(x2);
        double deltaPhi = Math.toRadians(x2 - x1);
        double deltaLambda = Math.toRadians(y2 - y1);

        double a = Math.sin(deltaPhi / 2) * Math.sin(deltaPhi / 2) +
                Math.cos(phi1) * Math.cos(phi2) *
                        Math.sin(deltaLambda / 2) * Math.sin(deltaLambda / 2);

        double c = 2 * Math.asin(Math.sqrt(a));
        double r = 6371.0;
        double distance = r * c;
        System.out.println(distance + " kilometers");
    }
}
