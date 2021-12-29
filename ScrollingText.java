import java.lang.*;
import java.awt.*;
import java.applet.Applet;

/*
<applet code="ScrollingText.class" width=600 height=400>
</applet>
*/


public class ScrollingText extends Applet implements Runnable
{
  String  d = "Swami Vivekananda Institute of Technology    ";
  Thread t;



public void init ()
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
       t.sleep(1000);
       repaint();
    }
    catch(Exception e){
   System.out.println(e);
}
}
}

public void paint(Graphics g)
{
Font f = new Font("Times New Roman",Font.PLAIN,100);
g.setFont(f);
g.setColor(Color.RED);

char ch = d.charAt(0);
d = d.substring(1);
d = d + ch;

g.drawString(d,200,300);
}


}

