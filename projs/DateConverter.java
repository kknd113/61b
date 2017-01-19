import java.io.*;

public class DateConverter {

  /** Reads a day number in 2004, an integer between 1 and 366, and prints 
   *  the date in month/day format. */
  // The code is missing two assignment statements.
  public static void main (String [ ] args) {
    BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
    while (true) {
      int dayOfYear = 0;
      try {
	dayOfYear = Integer.parseInt (keyboard.readLine ( ));
      } catch (NumberFormatException e) {
	e.printStackTrace();
      } catch (IOException e) {
	e.printStackTrace();
      }
      int month, dateInMonth, daysInMonth;
      month = 1;
      daysInMonth = 31;
      while (dayOfYear > daysInMonth) {
	// *** Here is one possible place to put assignment statements.
	if (month == 2) {
	  daysInMonth = 29;
	} else if (month == 4 || month == 6 || month == 9 || month == 11) {
	  daysInMonth = 30;
	} else {
	  daysInMonth = 31;
	}
	// *** Here is another possible place to put assignment statements.
      }
      dateInMonth = dayOfYear;
      System.out.println (month + "/" + dateInMonth);
    }
  }
}