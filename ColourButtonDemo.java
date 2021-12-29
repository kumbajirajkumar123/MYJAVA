import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.lang.*;
import java.util.*;


class MyAdapter extends WindowAdapter
{
  ColourButtonDemo cb;
  MyAdapter(ColourButtonDemo cb)
  {
    this.cb = cb;
   }

public void windowClosing(WindowEvent we)
{
 cb.dispose();
}
}


public class ColourButtonDemo extends Frame implements ActionListener
{
  Button b1,b2,b3,b4;
  String selection = "";
   MyAdapter m;
 
  ColourButtonDemo()
  {
   m = new MyAdapter(this);
   addWindowListener(m);

   setLayout(new FlowLayout());

  b1 = new Button("Line");
  b2 = new Button("Rect");
  b3 = new Button("Circle");
  b4 = new Button("Ellipse");

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
  selection = ae.getActionCommand();
  repaint();
}

public void paint(Graphics g)
{
try
{
if(selection.equals("Line"))
   g.drawLine(30,50,90,100);
else if(selection.equals("Rect"))
   g.fillRect(50,50,100,110);
else if(selection.equals("Circle"))
   g.fillOval(50,50,100,110);
else if (selection.equals("Ellipse"))
   g.fillOval(50,50,100,70);
}catch(Exception e)
{
System.out.println(e);
}
}

public static void main(String args[])
{
 ColourButtonDemo b = new ColourButtonDemo();
 b.setTitle("Colour Button");
 b.setSize(600,400);
 b.setVisible(true);
}



}
