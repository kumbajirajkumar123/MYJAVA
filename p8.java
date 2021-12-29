import java.lang.*;
 
class Box
{
int l,b;

void setLength(int x){
 l=x;
}

void setBreadth(int x){
 b=x;
}

void display(){
 System.out.println(l+" "+b);
}
}

class p8
{
public static void main(String args[])
{
Box b1 = new Box();
b1.l=11;
b1.b=13;
b1.display();
}
}