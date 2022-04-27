import java.util.Scanner;

public class Track
{

   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter the winning time: ");
      double time = kb.nextDouble();
      
      double meterTime= getMeters(time);
      double feetTime = getFeet(time);
      double kiloTime = getKilo(time);
      double mileTime = getMiles(time);
      
      double secs = time * 16.0934;
      int sec = (int) secs % 60;
      int min = (int) (secs / 60) % 60;
      
      double ySecs = meterTime * 10.9361;
      int ySec = (int) ySecs % 60;
      int yMin = (int) (ySecs / 60) % 60;

      displayTime(meterTime, feetTime, kiloTime, mileTime, min, sec, yMin, ySec);   
 
   }
   
   private static double getMeters(double time)
   {
      return 100/time;
   
   }
   
   private static double getFeet(double time)
   {
      double forFeet = time * 3.28084;
      return forFeet;
   }
   
   private static double getKilo(double time)
   {
      double forKilo = time * 3.6;
      return forKilo;
   }
   
   private static double getMiles(double time)
   {
      double forMile = time * 2.2369362920544;
      return forMile;
   }
  
   private static void displayTime(double meterTime,double theFeetTime,double theKiloTime,double mileTime, int mins, int secs, int yMins, int ySecs)
   {
      System.out.println("The person was traveling at a rate of: \n");
      System.out.printf("%5.2f Meters per second\n", meterTime);
      System.out.printf("%5.2f Feet per second\n", theFeetTime);
      System.out.printf("%5.2f Kilometers per hour\n", theKiloTime);
      System.out.printf("%5.2f Miles per hour\n", mileTime);
      System.out.printf("It would take %d minutes and %d seconds to run one mile.\n", mins, secs); 
      System.out.printf("It would take %d minutes and %d seconds to run 100 yards.", yMins, ySecs);
      
      
   }
   
}