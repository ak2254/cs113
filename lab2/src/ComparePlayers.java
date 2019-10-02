// **************************************************************
// ComparePlayers
//
// Reads in two Player objects and tells whether they represent
// the same player.
// **************************************************************
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
 
 
 