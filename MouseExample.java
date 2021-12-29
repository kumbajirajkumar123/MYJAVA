import java.awt.*;
import java.awt.event.*;

public class MouseExample extends Frame implements MouseListener
{

   int x,y;

   MouseExample()
   {
    addMouseListener(this);
   }

  public void mousePressed(MouseEvent me) {}
  public void mouseReleased(MouseEvent me) {}
  public void mouseClicked(MouseEvent me) {
   x = me.getX();
   y = me.getY();
   repaint();
  }
  public void mouseExited(MouseEvent me) {}
  public void mouseEntered(MouseEvent me) {}
  

  public void paint(Graphics g)
  {
   g.setColor(Color.RED);
   g.fillOval(x-10,y-10,20,20);
  }


public static void main(String args[])
{

 MouseExample mb = new MouseExample();
 mb.setSize(600,400);
 mb.setTitle("MovingBall Demo");
 mb.setVisible(true);
}
}