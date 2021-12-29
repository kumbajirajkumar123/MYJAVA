import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;

class HashsetDemo
{
public static void main(String args[])
{

HashSet <String> hs = new HashSet<String>();

hs.add("Raj");
hs.add("Aditya");
hs.add("Sravya");
hs.add("Kumar");

System.out.println(hs.size());

System.out.println(hs.contains("Raj"));

Iterator i = hs.iterator();

while(i.hasNext())
{
  System.out.println(i.next());

}
}
}