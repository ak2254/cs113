
public class Coin
{
  private final static int HEADS = 0;
  private final int TAILS = 1;
  private static int face;
   public Coin ()
   {
	   flip(); 
	   }
 
   public static void flip ()
   {
      face = (int) (Math.random() * 2);
}
//----------------------------------------------------------------- // Returns true if the current face of the coin is heads. //----------------------------------------------------------------- 
   public static boolean isHeads ()
   {
      return (face == HEADS);
}
//----------------------------------------------------------------- // Returns the current face of the coin as a string. //----------------------------------------------------------------- 
   public String toString()
   {
      String faceName;
      if (face == HEADS)
              faceName = "Heads";
      else
             faceName = "Tails";
      return faceName;
   }
}
