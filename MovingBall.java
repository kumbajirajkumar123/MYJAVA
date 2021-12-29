import java.awt.*;
import java.applet.Applet;

/*
<applet code="MovingBall.class" width=600 height=400>
</applet>
*/

public class MovingBall extends Applet implements Runnable
{

   Thread t;

   int x=100,y=100,w=600,h=400,dx = 5,dy= 5;

public void init()
{
  t = new Thread(this);
  t.start();
}

public void run()
{
while(true)
{
try
{
t.sleep(50);
repaint();
}
catch(Exception e){}
}
}

public void paint(Graphics g)
{
 g.drawRect(0,0,600,400);
 g.setColor(Color.RED);
 if(dx < 0 && x <= 0)
      dx = 5;
 
 if(dx > 0 && x >= 600)
      dx = -5;

 if(dy > 0 && y >= 400)
      dy = -5;

 if(dy < 0 && y < 0) 
      dy = 5;


 x = x + dx;
 y = y + dy;

 g.fillOval(x,y,20,20);
 
}

}