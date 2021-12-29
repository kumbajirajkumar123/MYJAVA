import java.awt.*;
import java.applet.Applet;
import java.lang.*;


/*
<applet code="ScrollingTextParam.class" width=600 height=400>
<param name="msg" value="SVIT COLLEGE   ">
<param name="fname" value="Courier">
<param name="fsize" value="50">
</applet>
*/


public class ScrollingTextParam extends Applet implements Runnable
{
  String  d = "Swami Vivekananda Institute of Technology    ";
  Thread t;



public void init ()
{
 t = new Thread(this);
 t.start();
 d = getParameter("msg");
}

public void run()
{
 while(true)
  {
    try
    {
       t.sleep(100);
       repaint();
    }
    catch(Exception e){
   System.out.println(e);
}
}
}

public void paint(Graphics g)
{


char ch = d.charAt(0);
d = d.substring(1);
d = d + ch;

String fname = getParameter("fname");
int fsize = Integer.parseInt(getParameter("fsize"));

Font f = new Font(fname,Font.PLAIN,fsize);
g.setFont(f);
g.setColor(Color.RED);

g.drawString(d,200,300);
}


}

