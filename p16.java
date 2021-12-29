import java.lang.*;

class Person
{
String name;
int age;

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
this.name =name;
this.age = age;
this.ys = ys;
}

void print()
{
System.out.println(rollno+" "+name+" "+age+" "+ys);
}
}


class p16
{
public static void main(String args[])
{

Student s = new Student();
s.saveData(789,"Kumar",19,14);
s.print();
s.display();
}
}