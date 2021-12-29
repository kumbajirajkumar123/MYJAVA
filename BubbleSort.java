import java.util.*;
 class BubbleSort
{
 public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
int x[]=new int[20];
int size;
int temp;
System.out.println("How many no.");
size=sc.nextInt();


System.out.println("Enter the elements to sort");
  for(int i=0;i<=size;i++)
    x[i] =sc.nextInt();
 for(int i=0;i<=size-1;i++)
  {
  for(int j=0;j<=size-i-1;j++)
  {
   if(x[j]<x[j+1])
   {
    temp=x[j];
    x[j]=x[j+1];
    x[j+1]=temp;
   }
   }
}
System.out.println("sorted elements are :");
   for(int i=0;i<=size;i++)
    System.out.println(x[i]); 

}
}