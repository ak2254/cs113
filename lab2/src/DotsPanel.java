
//
// Represents the primary panel for the Dots program. //*******************************************************************
 import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

 public abstract class DotsPanel extends JPanel implements MouseListener 
{
 private static LayoutManager object;
private final int SIZE =6;  // radius of each dot
private ArrayList<Point> pointList;
   

public DotsPanel()
{
	
pointList = new ArrayList<Point>();

setBackground (Color.black);
setPreferredSize (new Dimension(300, 200));

}

//----------------------------------------------------------------
//  Draws all of the dots stored in the list.
//----------------------------------------------------------------
public void paint(Graphics page)
{
super.paintComponent(page);

page.setColor (Color.green);
 for (Point spot: pointList)
 page.fillOval (spot.x-SIZE, spot.y-SIZE, SIZE*2, SIZE*2);
 page.drawString ("Count: " + pointList.size(), 5, 15);
 }
}
 
//*****************************************************************
//  Represents the listener for mouse events.
//*****************************************************************

