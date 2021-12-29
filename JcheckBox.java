import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.lang.*;
import java.util.*;
import javax.swing.*;

public class JcheckBox extends JPanel implements ActionListener
{
  JCheckBox c1,c2,c3,c4;
   

  JLabel jl;

  JcheckBox()
  {
   
   setLayout(new FlowLayout());

  c1 = new JCheckBox(" C Language ");
  c2 = new JCheckBox(" C++ Language ");
  c3 = new JCheckBox(" Java Language ");
  c4 = new JCheckBox(" Python Language ");

  c1.addActionListener(this);
  c2.addActionListener(this);
  c3.addActionListener(this);
  c4.addActionListener(this);

  add(c1);
  add(c2);
  add(c3);
  add(c4);
  
  jl = new JLabel();
  add(jl);

}

public void actionPerformed(ActionEvent ae)
{
  repaint();
}

public void paintComponent(Graphics g)
{
  super.paintComponent(g);

  String str = "Languages Known:  ";

  if(c1.isSelected())
       str = str + " C ";


  if(c2.isSelected())
       str = str + " C++ ";


  if(c3.isSelected())
       str = str + " Java ";


  if(c4.isSelected())
       str = str + " Python ";

  jl.setText(str);
}

public static void main(String args[])
{
 JcheckBox b = new JcheckBox();
 
 JFrame jf = new JFrame();
 jf.add(b);

 jf.setTitle("button Demo");
 jf.setSize(1000,800);
 jf.setVisible(true);
}
}

