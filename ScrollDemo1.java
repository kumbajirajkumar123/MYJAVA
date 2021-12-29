import java.applet.Applet;
import java.awt.Color;
import java.awt.*;

/*
<applet code="ScrollDemo1.class" width=600 height=600>
</applet>
*/

public class ScrollDemo1 extends Applet implements Runnable
{
   int x=200,y=200,speed=10,dx=10,dy=10;
   Thread t;
   

   String text = "Swami Vivekananda Institute of Technology";
   String d ="up";


public void init()
{

     if(d.equals("up"))
      {
        y = 500;
        x = 100;
        dy = -10;
        dx = 0;
      }
     else if(d.equals("down"))
      {
        y = 10;
        x = 100;
        dy = 10;
        dx = 0;
      }
     else if(d.equals("right"))
      {
        y = 50;
        x = 175;
        dy = 0;
        dx = 10;
      }
     else if(d.equals("left"))
      {
        y = 500;
        x = 175;
        dy = 0;
        dx = -10;
      }
     t = new Thread(this);
     t.start();
}


public void paint(Graphics g)
{
  g.setColor(Color.RED);
  Font f = new Font("Courier",Font.PLAIN,25);
  g.setFont(f);

  x = x + dx;
  y = y + dy;

  if(x > 500 && d.equals("right"))
       x = 0;
  if(x < -450 && d.equals("left"))
       x = 500;
  if(y < 0 && d.equals("up"))
       x = 400;
  if(y > 400 && d.equals("down"))
       y = 0;
  g.drawString(text,x,y);
  
  }

@Override
public void run()
{
while(true)
{
try
{
  t.sleep(100);
  repaint();
}
catch(Exception e) {}
}
}

}
















