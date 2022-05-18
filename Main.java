import java.util.*;

public class Main {
   public static int total = 0;
   public static String[] str1 = new String[] { "01.06.2022", "03.06.2022", "04.06.2022" };
   public static String[] str2 = new String[] { "21.05.2022", "02.06.2022", "05.06.2022" };
   public static String[] str3 = new String[] { "22.05.2022", "01.06.2022", "02.06.2022" };
   public static Movie movie1 = new Movie("The Godfather", 10, str1);
   public static Movie movie2 = new Movie("The Good, the Bad and the Ugly", 20, str2);
   public static Movie movie3 = new Movie("The Lord of the Rings: The Return of the King", 15, str3);

   static void function() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Choose the movie :\n1. " + movie1.getName() + "\n2. " + movie2.getName() + "\n3. "
            + movie3.getName());
      int movie_id = scanner.nextInt();

      if (movie_id == 1) {
         System.out.println("Choose day :\n1. " + movie1.getDays()[0] + "\n2. " + movie1.getDays()[1] + "\n3. "
               + movie1.getDays()[2]);
      } else if (movie_id == 2) {
         System.out.println("Choose day :\n1. " + movie2.getDays()[0] + "\n2. " + movie2.getDays()[1] + "\n3. "
               + movie2.getDays()[2]);
      } else {
         System.out.println("Choose day :\n1. " + movie3.getDays()[0] + "\n2. " + movie3.getDays()[1] + "\n3. "
               + movie3.getDays()[2]);
      }
      int day_id = scanner.nextInt();

      System.out.println("Choose hour :\n1. " + "13.00" + "\n2. " + "18.00");
      int hour_id = scanner.nextInt();

      System.out.println("How many tickets do you want to buy?:");
      int n = scanner.nextInt();

      if (movie_id == 1) {
         for (int i = 0; i < n; i++) {
            System.out.println("Choose seat :" + Arrays.toString(movie1.getSeats(day_id, hour_id)));
            String seat = scanner.next();
            movie1.BookTicket(day_id, hour_id, seat);
         }
      } else if (movie_id == 2) {
         for (int i = 0; i < n; i++) {
            System.out.println("Choose seat :" + Arrays.toString(movie2.getSeats(day_id, hour_id)));
            String seat = scanner.next();
            movie2.BookTicket(day_id, hour_id, seat);
         }
      } else {
         for (int i = 0; i < n; i++) {
            System.out.println("Choose seat :" + Arrays.toString(movie3.getSeats(day_id, hour_id)));
            String seat = scanner.next();
            movie3.BookTicket(day_id, hour_id, seat);
         }
      }

      if (movie_id == 1) {
         total = total + n * movie1.getPrice();
      } else if (movie_id == 2) {
         total = total + n * movie2.getPrice();
      } else {
         total = total + n * movie3.getPrice();
      }
      System.out.println("Do you want to buy more tickets? (if yes , type 1,else 0)");
      int bool = scanner.nextInt();
      if (bool == 1) {
         function();
      } else {
         System.out.println("Thank you for choosing us. See you later.");
         return;
      }
   }

   public static void main(String[] args) {
      function();
   }
}