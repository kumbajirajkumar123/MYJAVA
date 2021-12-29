import java.lang.*;
import java.util.*;

class lowercase
{
public static void main(String args[])
{

Scanner x = new Scanner (System.in);

System.out.println("Enter your name");
String s = x.nextLine();

System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
//System.out.println(s.trim()); //not working

}
}