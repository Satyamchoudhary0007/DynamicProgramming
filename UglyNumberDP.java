package DynamicProgramming;

import java.util.Scanner;

public class UglyNumberDP {
    public static int Ugly(int n)
    {

        int ugly_array[]=new int[n];
        int i2=0,i3=0,i5=0;
        int n2=2,n3=3,n5=5;
        int next_no=1;
        ugly_array[0]=1;
        for(int i=1;i<n;i++)
        {
            next_no=Math.min(n2,Math.min(n3,n5));
            ugly_array[i]=next_no;
            if(next_no==n2)
            {
                i2=i2+1;
                n2=ugly_array[i2]*2;
            }
            if(next_no==n3)
            {
                i3=i3+1;
                n3=ugly_array[i3]*3;
            }
            if(next_no==n5)
            {
                i5=i5+1;
                n5=ugly_array[i5]*5;
            }

        }
        return next_no;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(Ugly(n));
    }
}
