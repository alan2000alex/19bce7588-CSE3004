import java.util.Scanner;

public class MoneyChange {

    int[] coinDenom(int amount) {
        int denom[] = { 1000, 500, 100, 10, 5, 1 };
        int freq[] = new int[denom.length];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 0;
        }
        for (int i = 0; i < denom.length; i++) {
            while (amount >= denom[i]) {
                freq[i] += 1;
                amount -= denom[i];
            }
        }
        return freq;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an amount: ");
        int amount = in.nextInt();
        int denom[] = { 1000, 500, 100, 10, 5, 1 };
        MoneyChange obj = new MoneyChange();
        int[] denomArray = obj.coinDenom(amount);
        int sum = 0;

        for (int i = 0; i < denomArray.length; i++) {
            sum += denomArray[i];
        }
        System.out.println("Number of Coins Required: " + sum);
        for (int i = 0; i < denom.length; i++) {
            while (denomArray[i] > 0) {
                System.out.print(denom[i] + " ");
                denomArray[i]--;
            }
        }
    }
}
