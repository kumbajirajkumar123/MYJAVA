import java.lang.*;
import java.util.*;

class strng
{
public static void main(String args[])
{
int n = 5;

String s1 = new String("Who let the " + n +" dogs out?");

String s2 = "Who who who who!";

String s3 = s1 + s2;

System.out.println(s3);
}
}