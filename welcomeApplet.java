import java.awt.*;
import java.applet.Applet;

public class welcomeApplet extends Applet
{
String str;

public void init()
{
  str = "Welcome to Applet programming";
}
public void paint(Graphics g)
{
g.drawRect(50,50,400,400);
g.drawLine(250,50,250,450);
g.drawLine(50,250,450,250);
g.drawRect(75,75,150,150);
g.drawOval(275,75,150,150);
g.drawLine(75,275,225,425);
g.drawLine(75,275,225,425);
g.drawLine(75,425,225,270);
g.drawArc(275,300,150,250,30,125);

for(int i=500;i<=0;i--)
{
  g.drawString("This is a sample scrolling text that has scrolls texts to left.");

}

//g.setColor(Color.ORANGE);
//g.fillRoundRect(50,50,400,200,25,25);
}

}