import java.io.Console;

public class Main {

    public static void main(String[] args) {
        int[][] mass = {{9,1,2}, {15, 4, 3}, {18, 7, 8}};
        int max = 0;
        for (int i = 0; i < mass.length; i++)
            for (int j = 0; j < mass[i].length; j++)
                if (mass[i][j] > max) {
                    max = mass[i][j];
                }
        System.out.println(max);
    }

}
