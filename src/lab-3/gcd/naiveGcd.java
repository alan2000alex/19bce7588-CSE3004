import java.util.Scanner;  
public class naiveGcd
{  

public static int findGCD(int a, int b)  
{  
while(b != 0)  
{  
if(a > b)  
{  
a = a - b;  
}  
else  
{  
b = b - a;  
}  
}  
return a;  
}  
public static void main(String[] args)   
{  
int a, b, gcd = 0;  
Scanner in = new Scanner(System.in);  
System.out.print("Enter the First Number: ");  
a = in.nextInt();     
System.out.print("Enter the Second Number: ");  
b = in.nextInt();  
gcd = findGCD(a, b);  
System.out.println("GCD of " + a + " and " + b + " =  " + gcd);  
}  
}  
