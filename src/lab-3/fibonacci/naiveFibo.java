package fibonacci;

import java.util.Scanner;

class naiveFibo {

    int fibo(int num) {
        if(num <= 1)
            return num;
        else 
            return fibo(num-1) + fibo (num-2);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();
        // int arr[] = new int[n];
        naiveFibo obj = new naiveFibo();
        int nth = obj.fibo(n);
        System.out.println();
        System.out.println(n+"th term of the fibo series: \n"+ nth);
        // System.out.println(nth);
    }
}