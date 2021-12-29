import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

public class DragRect extends Frame implements MouseListener,MouseMotionListener
{


   int x1,y1,x2,y2,c;

  DragRect()
   {
     addMouseListener(this);
     addMouseMotionListener(this);
    }

   public void mousePressed(MouseEvent me) {
      x1 = me.getX();
      y1 = me.getY();
      c=1;
      repaint();
    }
    
   public void mouseReleased(MouseEvent me) {
      x2 = me.getX();
      y2 = me.getY();
      c=2;
      repaint();
   }
   public void mouseClicked(MouseEvent me) {}
   public void mouseExited(MouseEvent me) {}
   public void mouseEntered(MouseEvent me) {}


   public void mouseMoved(MouseEvent me) {}
   public void mouseDragged(MouseEvent me) {
     x2 = me.getX();
     y2 = me.getY();
     c =3;
     repaint();
   }


   public void paint(Graphics g)
    {


      if(c==1)
       {
        g.setColor(Color.RED);
        g.fillRect(x1,y1,30,40);
       }
        
       else if(c==2)
        {
         g.setColor(Color.GREEN);
         g.fillRect(x2,y2,30,40);
         }
  
       else if(c==3)
        {
         g.setColor(Color.BLUE);
         g.fillRect(x2,y2,30,40);
        }
}

   
public static void main(String args[])
{
  
 DragRect dr = new DragRect();
 dr.setSize(600,400);
 dr.setTitle("Rectangle Dragging");
 dr.setVisible(true);  

}
}
  


        
     




