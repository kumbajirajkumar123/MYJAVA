import java.lang.*;
import java.util.*;

class PyramidPattern
{
public static void main(String args[])
{
int i,j,row =6;
for(i=0;i<row;i++)
{
for(j=row-i;j>1;j--)
{
System.out.println(" ");
}
for(j=0;j<=i;j++)
{
System.out.println("* ");
}
System.out.println("");
}
}
}