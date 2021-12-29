import java.lang.*;

class equals
{
public static void main(String args[])
{
String s1 = "Swami";
String s2 = "Swami";
String s3 = "Vivekananda";
String s4 = "swami";
String s5 =  new String("Swami");

System.out.println(s1.compareToIgnoreCase(s4));


if(s1==s5)
System.out.println("Same Object,i.e.,Same content");
else 
 System.out.println("Refering to two different obects");


}
}