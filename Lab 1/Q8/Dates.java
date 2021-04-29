import java.util.Date;
import java.util.*;
import java.text.*;

public class Dates{

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date using toString()
      System.out.println("Today is " + date.toString());
      System.out.println("");


      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat (" dd MMMMMMM yyyy hh:mm");     
      System.out.println("On est le" + ft.format(dNow)); 
   }
}