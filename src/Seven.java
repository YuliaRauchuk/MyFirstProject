public class Seven {
public static void main(String[] args) {
        int days=0;
        double day1 = 10;
        double km = 10;

        for (int i=0; i<7;i++) {
        day1 = day1+ (day1 * 0.1);
        km = km + day1;
        days++;
        }

        System.out.print("Summa: " + km + " = " + days);
        }
        }