import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.awt.Frame;


class MyAdapter extends WindowAdapter
{
 Frame kd;
 MyAdapter(Frame kd)
 {
 this.kd = kd;
 }
 public void windowClosing(WindowEvent we)
 {
 kd.dispose();
 }
}

public class ButtonDemo extends Frame implements ActionListener
{
Button b1,b2,b3,b4;
String selection = "";
MyAdapter m;

ButtonDemo()
{
 m = new MyAdapter(this);
 addWindowListener(m);

 b1= new Button("Line");
 b2= new Button("Rect");
 b3= new Button("Circle");
 b4= new Button("Ellipse");

 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);	


 add(b1);
 add(b2);
 add(b3);
 add(b4);
}

public void actionPerformed(ActionEvent ae)
{
selection = getActionCommand();
repaint();
}

public void paint(Graphics g)
{
if(selection.equals("Line"))
   g.drawLine(30,50,90,100);
else if(selection.equals("Rect"))
   g.fillRect(50.50,100,100);
else if(selection.equals("Circle"))
   g.fillOval(50,50,100,100);
else if (selection.equals("Ellipse"))
   g.fillOval(50,50,100,70);
}

 public static void main(String args[])
 {
 ButtonDemo d = new ButtonDemo();
 d.setTitle("Button Demo");
 d.setSize(600,400);
 d.setVisible(true);
 }


}
	