package DynamicProgramming;

import java.util.Scanner;
//Complexity of this program is linear
/*Dynamic Programming is used here we are storing previous data which will be used further to find the values*/
public class FibonacciDP {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int fib[]=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i=0;i<=n;i++)
        {
            System.out.print(fib[i]+" ");
        }
    }
}
