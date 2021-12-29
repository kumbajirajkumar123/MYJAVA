import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.lang.*;
import java.util.*;
import javax.swing.*;

public class buttonDemo1 extends JPanel implements ActionListener
{
  JButton b1,b2,b3,b4,s;

  JLabel jl;

 buttonDemo1(){
 
   setLayout(new FlowLayout());

  b1 = new JButton("Line");
  b2 = new JButton("Rect");
  b3 = new JButton("Circle");
  b4 = new JButton("Ellipse");

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
 
  add(b1);
  add(b2);
  add(b3);
  add(b4);

  jl = new JLabel();
  add(jl);

}

public void actionPerformed(ActionEvent ae)
{
  s = (JButton) ae.getSource();
  repaint();
}

public void paintComponent(Graphics g)
{
  super.paintComponent(g);

g.setColor(Color.RED);

if(s == b1)
   g.drawLine(200,200,400,400);
else if(s == b2)
   g.fillRect(200,200,400,400);
else if(s == b3)
   g.fillOval(200,200,400,400);
else if (s == b4)
   g.fillOval(200,200,400,200);
 
}

public static void main(String args[])
{
 buttonDemo1 b = new buttonDemo1();
 
 JFrame jf = new JFrame();
 jf.add(b);

 jf.setTitle("button Demo");
 jf.setSize(1000,800);
 jf.setVisible(true);
}
}


