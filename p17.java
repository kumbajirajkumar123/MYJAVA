import java.lang.*;

class Person
{
private String name;
private int age;

void setData(String name,int age)
{
this.name = name;
this.age = age;
} 	

void display()
{
System.out.println(name+ " " + age);

}
}


class Student extends Person
{
int rollno;
int ys;
void saveData(int rollno, String name,int age,int ys)
{
this.rollno = rollno;
setData(name,age);
this.ys = ys;
}

void display()
{

System.out.print(rollno+" ");
super.display();
System.out.println(" "+ys);
}
}


class p17
{
public static void main(String args[])
{

Student s = new Student();
s.saveData(789,"Kumar",19,14);

s.display();
}
}