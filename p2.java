import java.util.*;
public class p2

{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    System.out.println("Enter a Number");
	    int a = x.nextInt();
	    System.out.println("Enter a Number");
	    int b = x.nextInt();
	    System.out.println("Enter a Number");
	    int c = x.nextInt();
	    
	    if(a > b && a > c)
	    System.out.println("Biggest number is "+a);
	    else if(b > c)
	    System.out.println("Biggest number is "+b);
	    else
	    System.out.println("Biggest number is "+c);
	    
		System.out.println("Hello World");
	}
}

