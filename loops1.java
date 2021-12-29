import java.util.*;
import java.io.*;

class loops1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        for(int r=0;r<=t;r++)
        {
         for(int y=0;y<n;y++)
          {
           for(int k=0;k<=y;k++)
           {
            System.out.print(pow(2,y)*b);
           }
          }
         }
         System.out.print(" ");
        if(n=0)
        {
         System.out.print(a+pow(2,y)*b);
         }
        in.close();
    }
}