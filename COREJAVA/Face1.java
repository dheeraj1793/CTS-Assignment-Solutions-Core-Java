import java.awt.*;
import java.applet.*;
/*<applet code=Face1.class width=300 height=300>
</applet>*/

public class Face1 extends Applet implements Runnable
{

Thread t1;
int i=0;
public void init()
{
t1= new Thread(this);
t1.start();
}

public void run()
{
while(true)
{
try
{
if (Thread.currentThread() == t1)
{
if (i==0)
i=1;
else
i=0;
Thread.sleep(1000);
}
}
catch (InterruptedException ie) { }
repaint();
}
}


public void paint(Graphics g)
{
g.drawOval(40,40,120,150); //Head
if(i==0)
{
g.drawOval(57,75,30,20);   // Left Eye
g.drawOval(110,75,30,20);  // Right Eye
g.fillOval(68,81,10,10);    //Left Pupil
g.fillOval(121,81,10,10); //Right Pupil
g.fillArc(60,125,80,40,180,180); //Mouth
}
else
{
g.drawOval(57,85,30,0);   // Left Eye
g.drawOval(110,85,30,0);  // Right Eye
g.fillOval(68,81,10,0);    //Left Pupil
g.fillOval(121,81,10,0); //Right Pupil
g.fillArc(60,135,80,40,0,360); //Mouth
}
g.drawOval(85,100,30,30); //Nose
//g.fillArc(60,125,80,40,180,180); //Mouth
g.drawOval(25,92,15,30); //left ear
g.drawOval(160,92,15,30); // right ear

}
}


