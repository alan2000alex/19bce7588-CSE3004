import java.util.Scanner;
class LargestNo {

    Boolean isGreaterOrEqual(int a, int b) {
        String s1 = "" +a;
        String s2 = "" + b;
        // String f = "";
        // if(Integer.parseInt(s1+s2) > Integer.parseInt(s1+s2))
        //     f = s1+s2;
        // else
        //     f = s2+s1;
        return Integer.parseInt(s1+s2) > Integer.parseInt(s2+s1);
    }
    String large(int[] digits, int arr_length) {
        String ans = "";int maxDigit,maxIndex=0;
        maxDigit = digits[0];
        while(arr_length>0) {
            
            for(int i = 0;i<digits.length;i++) {
                // System.out.println(digits[i]);
                if(digits[i] != -1) {
                    if(isGreaterOrEqual(digits[i], maxDigit)) {
                        maxDigit = digits[i];
                        maxIndex = i;
                    }
                }
                else
                    continue;
            }
            // System.out.println();
            // System.out.println(maxIndex);
            if(maxDigit!=-1)
                ans += maxDigit;
            arr_length--;
            digits[maxIndex] = -1;
            maxDigit = 0;
            // for(int i = 0; i < digits.length;i++) {
            //     System.out.print(digits[i]+" ");
            // }
            // System.out.println();
        }
        return ans;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of digits: ");
        int n = in.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter digits: ");
        for(int i = 0;i < n;i++) {
            digits[i] = in.nextInt();
        }
        LargestNo obj = new LargestNo();
        String s= new String(obj.large(digits,n));

        // System.out.println(obj.isGreaterOrEqual(5, 3));
        System.out.println();
        System.out.println(s);
        in.close();
        // System.out.println(Integer.MIN_VALUE);
    }
}