import java.lang.*;

class Thread1 
{
public static void main(String args[])
{

Thread maint = Thread.currentThread();
maint.setName("Raj");
maint.setPriority(6);
System.out.println(maint);
}
}