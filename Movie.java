import java.util.*;

public class Movie {
   private String name;
   private int price;
   private String[][][] seats = {
         {
               { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" },
               { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }
         },
         {
               { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" },
               { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }
         },
         {
               { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" },
               { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }
         }
   };
   private String[] days;
   private String[] hours = { "13.00", "18.00" };

   public Movie(String name, int price, String[] days) {
      this.name = name;
      this.price = price;
      this.days = days;
   }

   public String getName() {
      return this.name;
   }

   public String[] getDays() {
      return this.days;
   }

   public String[] getHours() {
      return this.hours;
   }

   public int getPrice() {
      return this.price;
   }

   public String[] getSeats(int day, int hour) {
      return this.seats[day - 1][hour - 1];
   }

   public void BookTicket(int day, int hour, String seat) {
      int x = Integer.parseInt(seat);
      if (this.seats[day - 1][hour - 1][x - 1] == "x") {
         System.out.println("This sead has already been booked. Choose another seat :");
         Scanner scanner = new Scanner(System.in);
         String choice = scanner.next();
         this.BookTicket(day, hour, choice);
      } else {
         this.seats[day - 1][hour - 1][x - 1] = "x";
         System.out.println("You booked this seat successfully.");
      }
   }
}
