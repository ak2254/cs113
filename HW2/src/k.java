
import java.util.*;

public class k
{ 
    public static boolean isInside (double x1, double y1)  
    {  
        double distance = Math.sqrt((x1 * x1) + (y1 * y1));
        return (distance < 1.0);
    }
    
    

    public static double computePI (int numRepeats)
    { 
        Random randomGen = new Random (System.currentTimeMillis());    
        int repeats = 0;
        double PI = 0;     

        for (int i = 1; i <= numRepeats; i++)

        { 

            double x1 = (randomGen.nextDouble()) * 2 - 1.0;

            double y1 = (randomGen.nextDouble()) * 2 - 1.0;

            if (isInside(x1, y1))
            {

                repeats++;

           }
        }
        double dRepeats = numRepeats;
        
         
        
            PI = (4.0 * (repeats/dRepeats));
        
         
        
                return PI;
        
            }
        
         
        
            public static void main (String[] args)
        
            {
        
               Scanner scan = new Scanner (System.in);
        
               System.out.print("Please enter number of times you would like to run this program: ");
        
                int numRepeats = scan.nextInt();
        
                double PI = computePI(numRepeats);
        
                System.out.println ("Computed PI = " + PI);    
        
            }
        
        }



        
