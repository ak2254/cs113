

	// ****************************************************************
	// Dog.java
	//
	// A class that holds a dog's name and can make it speak.
	//
	// ****************************************************************
public abstract class Dog{
	protected String name;
	// ------------------------------------------------------------
	// Constructor -- store name
	// ------------------------------------------------------------
	public Dog(String name)
	{
	  this.name = name;
	}
	// ------------------------------------------------------------
	// Returns the dog's name
	// ------------------------------------------------------------
	public String getName()
	{
	  return name;
	}
	// ------------------------------------------------------------
	// Returns a string with the dog's comments
	// ------------------------------------------------------------
	public String speak()
	{
	  return "Woof";
	}
	public abstract int avgBreedWeight();
	}

public class dogTest 
{
 public static void main(String[] args)
{
	
	 Dog l = new Labrador("shine", "sandwitch");
	 Dog k = new Yorkshire("Manav", "white");
	 
		
	 System.out.println(l.getName() + " says " + l.speak());
	 System.out.println("the average weight is: " + l.avgBreedWeight());
	 System.out.println("the average weight is: " + k.avgBreedWeight());
	 
	 
 }

  } 
public class Labrador extends Dog{
	 private String color; //black, yellow, or chocolate?
	 private  int breedWeight = 75;
	  public Labrador(String name,  String color)
	 {
		  super(name);
		  this.color = color;
	  }
	 // ------------------------------------------------------------
	 // Big bark -- overrides speak method in Dog
	 // ------------------------------------------------------------
	 public String speak()
	 {
		 return "WOOF";
	 }
	 // ------------------------------------------------------------
	 // Returns weight
	 // ------------------------------------------------------------
	 public  int avgBreedWeight()
	 {
	 return breedWeight;
	 }

}
//*****************************************************************
//Yorkshire.java
//

public class Yorkshire extends Dog
{
	 int breedWeight = 75;
private String color;
public Yorkshire(String name, String color )
{
super(name);
this.color = color;
}
//-------------------------------------------------------------
//Small bark -- overrides speak method in Dog
//-------------------------------------------------------------
public String speak()
{
return "woof";
}
@Override
public int avgBreedWeight() {
	
	return breedWeight;
}
}
//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************



public class IntList
{
	protected int[] list;
	protected int numElements = 0;
//-------------------------------------------------------------
// Constructor -- creates an integer list of a given size.
//-------------------------------------------------------------
	public IntList(int size)
	{
		list = new int[size];
		}
//------------------------------------------------------------
// Adds an integer to the list.  If the list is full,
// prints a message and does nothing.
//------------------------------------------------------------
	public void add(int value)
	{
		if (numElements == list.length) {
			System.out.println("Can't add, list is full");
		}
		else {
			list[numElements] = value;
			numElements++;
	
 }
}
 
//-------------------------------------------------------------
// Returns a string containing the elements of the list with their
// indices.
//-------------------------------------------------------------
	public String toString()
	{
		String returnString = "";
		for (int i=0; i<numElements; i++)
			returnString += i + ": " + list[i] + "\n";
		return returnString;
}
}

public class ListTest
{
public static void main(String[] args)
{
IntList myList = new IntList(10);
myList.add(100);
myList.add(50);
myList.add(200);
myList.add(25);
System.out.println(myList);
}
}
public class SortedIntList extends IntList {
	public SortedIntList(int size) {
		super(size);
		   }
	public void add(int value) {
		if (numElements == list.length) {
			System.out.println("Can't add" );
				}
		else {
			Boolean k = false;
			for(int i=0;i<numElements;i++){
				if(value <=list[i]) {
					k = true;
					return;
					}
				if(k==false) {
					list[numElements] = value;
		           } 
		         else {
		        	   numElements++;
		       }
		   }
				}
				}
	public String toString() {
		return "Sorted Integer List;";
		   }
		}
import java.util.Scanner;
public class Player
{
private String name;
private String team;
private int jerseyNumber;
//-----------------------------------------------------------
// Prompts for and reads in the player's name, team, and
// jersey number.
//-----------------------------------------------------------
public void readPlayer()
{
Scanner scan = new Scanner(System.in);
System.out.print("Name: ");
name = scan.nextLine();
System. out. print ("Team: ");
team = scan.nextLine();
System.out.print("Jersey number: ");
jerseyNumber = scan.nextInt();
}
public boolean equals(Player o) {
	if (o == this){
        return true;
    } 
	else {
		return false;
	}	
}

}
//**************************************************************
//ComparePlayers
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**************************************************************
import java.util.Scanner;
public class ComparePlayers
{
public static void main(String[] args)
{
Player player1 = new Player();
Player player2 = new Player();
//Prompt for and read in information for player 1
//Prompt for and read in information for player 2
//Compare player1 to player 2 and print a message saying
//whether they are equal
player1.readPlayer();
player2.readPlayer();
if(player1.equals(player2)) {
	 System.out.println("same"); 
}
else {
	 System.out.println("diffrent");
}
}
}

//
//  Demonstrates mouse events.
//*******************************************************************
import javax.swing.JFrame;
public class Dots
{
//---------------------------------------------------------------- // Creates and displays the application frame. //---------------------------------------------------------------- public static void main (String[] args)
{
JFrame frame = new JFrame ("Dots");
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

frame.getContentPane().add (new DotsPanel());
frame.pack();
frame.setVisible(true);
}
}


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


//********************************************************************
// Rebound.java      Author: Lewis/Loftus
//
// Demonstrates an animation and the use of the Timer class.
//********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Rebound
{
//----------------------------------------------------------------- // Displays the main frame of the program. //----------------------------------------------------------------- public static void main (String[] args)
{
JFrame frame = new JFrame ("Rebound");
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
}
frame.getContentPane().add(new ReboundPanel());
frame.pack();
frame.setVisible(true);
}
//ReboundPanel.java      Author: Lewis/Loftus
//
//Represents the primary panel for the Rebound program.
//*********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax. swing. *;
public class ReboundPanel extends JPanel
{
private final int WIDTH = 300, HEIGHT = 100;
private final int DELAY = 20, IMAGE_SIZE = 35;
private ImageIcon image;
private Timer timer;
private int x, y, moveX, moveY;
//------------------------------------------------------------------
//Sets up the panel, including the timer for the animation.
//------------------------------------------------------------------
public ReboundPanel()
{
timer = new Timer(DELAY, new ReboundListener());
image = new ImageIcon ("happyFace.gif");
x = 0;
y = 40;
moveX = moveY = 3;
setPreferredSize (new Dimension(WIDTH, HEIGHT));
setBackground (Color.black);
timer.start();
}
//-----------------------------------------------------------------
//Draws the image in the current location.
//-----------------------------------------------------------------
public void paintComponent (Graphics page)
{
super.paintComponent (page);
image.paintIcon (this, page, x, y);
}
//******************************************************************
//Represents the action listener for the timer.
//******************************************************************
private class ReboundListener implements ActionListener
{
//-------------------------------------------------------------- // Updates the position of the image and possibly the direction // of movement whenever the timer fires an action event. //--------------------------------------------------------------
public void actionPerformed (ActionEvent event)
{
x += moveX;
y += moveY;
if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
moveX = moveX * -1;
if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
moveY = moveY * -1;
repaint();
}
}
}
import java.awt.*;
//***************************************************
//DigitalDisplay.java
//
//A simple rectangular display of a single number
//***************************************************
public class DigitalDisplay
{
private int displayVal;
private int x, y;
private int width, height;
private Font displayFont;
//value to be displayed
//position
//size
//font for the number
//---------------------------------------------------------
//construct a DigitalDisplay object with the given values
//and New Century Schoolbook font in 40 point bold
//---------------------------------------------------------
public DigitalDisplay(int start, int x, int y, int w, int h)
{
this.x = x;
this.y = y;
width = w;
height = h;
displayVal = start;
displayFont = new Font ("New Century Schoolbook", Font.BOLD, 40);
}
 // ----------------------------
 // decrement the display value
 // ----------------------------
 public void decrement()
 {
   displayVal--;
}
 // ----------------------------
 // increment the display value
 // ----------------------------
 public void increment()
 {
   displayVal++;
}
 // ----------------------------
 // return the display value
 // ----------------------------
 public int getVal()
 {
   return displayVal;
}
 // ------------------------------------------------------
 // reset the display value to that given in the parameter
 // ------------------------------------------------------
 public void reset (int val)
 {
   displayVal = val;
}
 // ----------------
 // draw the display
 // ----------------
 public void draw (Graphics page)
 {
// draw a black border
page.setColor (Color.black);
page.fillRect (x, y, width, height);
// a white inside
page.setColor (Color.white);
page.fillRect (x + 5, y + 5, width - 10, height - 10);
// display the number centered
page.setColor (Color.black);
page.setFont (displayFont);
int fontHeight = page.getFontMetrics().getHeight();
int strWidth = page.getFontMetrics().stringWidth(""+displayVal);
page.drawString (""+displayVal, x + width/2 - strWidth/2,
             y + fontHeight/2 + height/2);
}
}
//**********************************************************
//CountDown.java
//
//Draws a digital display that counts down from 10.  The
//display can be stopped or reset with a mouse click.
//**********************************************************
import DigitalDisplay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CountDown extends JApplet
{
private final int DELAY = 200;
private Timer timer;
// ---------------------------------------------------------
//   Initialize the applet, including the animation.
// ---------------------------------------------------------
public void init()
{
 timer = new Timer (DELAY, null);
 getContentPane().add (new CountDownPanel(timer));
}
// ---------------------------------------------------------
//   Start the animation when the applet is started.
// ---------------------------------------------------------
public void start()
{
 timer.start();
}
// ---------------------------------------------------------
//   Stop the animation when the applet is stopped.
// ---------------------------------------------------------
public void stop()
{
 timer.stop();
} }
//**********************************************************
//CountDownPanel.java
//
//Panel for a digital display that counts down from 10.
//The display can be stopped or reset with a mouse click.
//**********************************************************
import DigitalDisplay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CountDownPanel extends JPanel
{
private final int WIDTH = 600;
private final int HEIGHT = 400;
private final int DISPLAY_WIDTH = 150;
private final int DISPLAY_HEIGHT = 100;
private final int DELAY = 2 00;
private final int COUNT_START = 10;
private DigitalDisplay clock;
private Timer timer;
//--------------------------------------------------------
//Set up the applet.
//--------------------------------------------------------
public CountDownPanel (Timer countdown)
{
//Set up the timer
setBackground (Color.blue);
setPreferredSize (new Dimension (WIDTH, HEIGHT));

//--------------------
//draw the clock
//--------------------
public void paintComponent (Graphics page)
{
super.paintComponent (page);
clock.draw(page);
}
}