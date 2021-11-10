import java.util.*;
import java.lang.*;
import java.io.*;

public class CarFuel1 {
    static int compute_refills(int total_dist, int full_tank, int stops[], int n) {
        int current_refills = 0;
        int num_refills = 0;
        int last_refill = 0;
        while (current_refills <= n) {
            last_refill = current_refills;
            while ((current_refills <= n) && (stops[current_refills + 1] - stops[last_refill]) <= full_tank) {
                current_refills = current_refills + 1;
            }

            if (current_refills == last_refill)
                return -1;
            if (current_refills <= n)
                num_refills = num_refills + 1;
        }
        return num_refills;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total distance: ");
        int dist = in.nextInt();
        System.out.println("Enter full tank distance: ");
        int tank = in.nextInt();
        System.out.println("Enter no of stops: ");
        int n = in.nextInt();
        int stops[] = new int[n + 2];
        stops[0] = 0;
        stops[n + 1] = dist;
        for (int i = 1; i <= n; i++) {
            stops[i] = in.nextInt();
        }

        int x = (compute_refills(dist, tank, stops, n));
        if ((compute_refills(dist, tank, stops, n) == -1)) {
            System.out.println("Destination too far");
            System.exit(0);
        }
        int y = dist - stops[n];
        System.out.println("Remaining Distance : " + y);
        in.close();
    }

}
