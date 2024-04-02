import java.util.Scanner;
// 2 - Write the code to find the Fibonacci series upto the nth term.

class Fibonacci{
    public static void printFibonacciSeries(int n)
    {
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<n;i++)
        {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
           
        }
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number upto which fibonacci series you want to print");
int n=sc.nextInt();
printFibonacciSeries(n);
    }
}