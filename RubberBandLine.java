import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class RubberBandLine extends Frame implements MouseListener,MouseMotionListener
{

   int x1,y1,x2,y2;

   RubberBandLine()
   {
    addMouseListener(this);
    addMouseMotionListener(this);
   }

  public void mousePressed(MouseEvent me) {
   x1 = me.getX();
   y1 = me.getY();
  }
  public void mouseReleased(MouseEvent me) {
   x2 = me.getX();
   y2 = me.getY();
   repaint();
  }
  public void mouseClicked(MouseEvent me) {}
  public void mouseExited(MouseEvent me) {}
  public void mouseEntered(MouseEvent me) {}
  

  public void mouseMoved(MouseEvent me) {}
  public void mouseDragged(MouseEvent me) {
   x2 = me.getX();
   y2 = me.getY();
   repaint();
  }


  public void update(Graphics g)
  {
    paint(g);
  }

  public void paint(Graphics g)
  {
   Random r = new Random();
   Color c = new Color(r.nextInt(225),r.nextInt(225),r.nextInt(225));
   g.setColor(c);
   g.drawLine(x1,y1,x2,y2);
  }


public static void main(String args[])
{

 RubberBandLine mb = new RubberBandLine();
 mb.setSize(600,400);
 mb.setTitle("Rubberband Line");
 mb.setVisible(true);
}
}