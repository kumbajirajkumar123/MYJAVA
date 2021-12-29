import java.util.*;

public class ages
{
  public static void main (String[]args)
  {

    Scanner x = new Scanner (System.in);

      System.out.println ("Enter your Age:");
    int a = x.nextInt ();

    if (a <= 12)
        System.out.println ("Child");
    else if (a >= 13 && a <= 19)
        System.out.println ("Teenager");
    else
        System.out.println ("Adult");

      System.out.println ("Hello World");
  }
}