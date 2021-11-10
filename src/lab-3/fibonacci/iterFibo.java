package fibonacci;

import java.util.Scanner;
class iterFibo {

    int[] fibo(int num) {
        int arr[] = new int[num];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < num; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10; 
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        iterFibo obj = new iterFibo();
        int fibo[] = obj.fibo(n+1);
        for(int i = 0; i<=n;i++) {
            System.out.print(fibo[i]+" ");
        }
        System.out.println();
        System.out.println("Last digit of Fn");
        System.out.println(fibo[n]);
    }
}