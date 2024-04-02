// 3. Check Whether or Not the Number is a Palindrome 

import java.util.Scanner;

class isPallindrome{
    public static boolean checkPallindrome(int n)
    {
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int d=n%10;
            sum=sum*10+d;
            n=n/10;
        }
    return temp==sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(checkPallindrome(n));
    }
}