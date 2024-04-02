// 1 - Write a code to reverse a number

import java.util.Scanner;

class reverseNumber{
    public static int reverse(int n)
    {
        int ans=0;
        while(n>0)
        {
            int d=n%10;
            ans=ans*10+d;
            n=n/10;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Reversed Number : "+reverse(n));
    }
}
