import java.util.Scanner;
import java.util.Arrays;

public class naiveBet {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of segments and points: ");
        String str = in.nextLine();
        String[] sp = str.split(" ");
        int no_of_segments = Integer.parseInt(sp[0]);
        int no_of_points = Integer.parseInt(sp[1]);

        int[] lower = new int[no_of_segments];
        int[] upper = new int[no_of_segments];

        System.out.println("Enter segment ranges: ");
        for (int i = 0; i < no_of_segments; i++) {
            str = in.nextLine();
            sp = str.split(" ");
            lower[i] = Integer.parseInt(sp[0]);
            upper[i] = Integer.parseInt(sp[1]);
        }

        int[] points = new int[no_of_points];
        System.out.println("Enter the points: ");

        for (int i = 0; i < no_of_points; i++)
            points[i] = in.nextInt();
        in.close();
        int[] contains = new int[no_of_points];
        Arrays.fill(contains, 0);

        for (int i = 0; i < no_of_points; i++) {
            for (int j = 0; j < no_of_segments; j++) {
                if (points[i] >= lower[j] && points[i] <= upper[j]) {
                    contains[i]++;
                }
            }
        }

        System.out.println("Count array: ");
        for (int i = 0; i < no_of_points; i++)
            System.out.print(contains[i] + " ");
    }
}
