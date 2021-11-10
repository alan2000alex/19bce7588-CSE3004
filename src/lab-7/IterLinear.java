import java.util.Scanner;

public class IterLinear {

    public static void main(String[] args) {

        System.out.println("Enter input Array Size:");
        Scanner scanner = new Scanner(System.in);
        int inputArraySize = scanner.nextInt();

        int inputArray[] = new int[inputArraySize];
        System.out.println("Enter " + inputArraySize + " Array Elements:");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        System.out.println("Enter Seach Key Element:");
        int seachKey = scanner.nextInt();

        int seachKeyIndex = linearSearch(inputArray, seachKey);
        if (seachKeyIndex != -1)
            System.out.println(seachKey + " found at index: " + seachKeyIndex);
        else
            System.out.println(seachKey + " not found in inputArray");

    }

    private static int linearSearch(int[] inputArray, int seachKey) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == seachKey)
                return i;
        }
        return -1;
    }
}