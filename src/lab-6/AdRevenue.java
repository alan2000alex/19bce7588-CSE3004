import java.util.*;

public class AdRevenue {
    public static void main(String[] args) {
        int no_of_ads, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Size of the array");
        no_of_ads = in.nextInt();

        Integer[] a = new Integer[no_of_ads];
        Integer[] b = new Integer[no_of_ads];
        Random rand = new Random();

        System.out.println("Enter the profits/click");
        for (int i = 0; i < no_of_ads; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < no_of_ads; i++)
            b[i] = rand.nextInt();

        System.out.println("Avg no.of clicks/day");
        for (int i = 0; i < no_of_ads; i++)
            System.out.print(b[i] + " ");

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < no_of_ads; i++) {
            sum = sum + a[i] * b[i];
        }
        System.out.println("Maximum: " + sum);
    }
}