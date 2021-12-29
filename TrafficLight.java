import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.lang.*;
import java.util.*;
import javax.swing.*;

public class TrafficLight extends JPanel implements ActionListener
{
  JRadioButton r1,r2,r3;
  ButtonGroup bg;
  String sel = "Go";

  JLabel jl;

  TrafficLight()
 {
   setLayout(new FlowLayout());

   r1 = new JRadioButton("Stop",false);
   r2 = new JRadioButton("Ready",false);
   r3 = new JRadioButton("Go",true);
  
   bg = new ButtonGroup();
   
   bg.add(r1);
   bg.add(r2);
   bg.add(r3);
   
   r1.addActionListener(this);
   r2.addActionListener(this);
   r3.addActionListener(this);

   add(r1);
   add(r2);
   add(r3);

   jl = new JLabel();
   add(jl);
}



public void paintComponent(Graphics g)
{

    super.paintComponent(g);

    Color c = Color.GREEN;
    if(sel.equals("Go"))
          c = Color.GREEN;
    else if(sel.equals("Ready"))
          c = Color.YELLOW;

    else if(sel.equals("Stop"))
          c = Color.RED;

    g.setColor(c);
    g.fillOval(100,100,200,200);

    jl.setForeground(c);
    jl.setText(sel +" is selected");

}

public void actionPerformed(ActionEvent ae)
{

   sel = ae.getActionCommand();
   repaint();
}

public static void main(String args[])
{

  try
     {
       SwingUtilities.invokeLater(new Runnable()
        {
          public void run()
           {
              JFrame jf = new JFrame();
              TrafficLight tl = new TrafficLight();
                
               jf.add(tl);

               jf.setSize(400,500);
               jf.setVisible(true);
               jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
         });
       }catch(Exception e){}
}
}


