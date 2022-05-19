import java.util.*;

public class Main {
   public static int total = 0;
   public static int movie_id;
   public static ArrayList<Ticket> tickets = new ArrayList<Ticket>();
   public static String[] str1 = new String[] { "01.06.2022", "03.06.2022", "04.06.2022" };
   public static String[] str2 = new String[] { "21.05.2022", "02.06.2022", "05.06.2022" };
   public static String[] str3 = new String[] { "22.05.2022", "01.06.2022", "02.06.2022" };
   public static Movie movie1 = new Movie("The Godfather", 10, str1);
   public static Movie movie2 = new Movie("The Good, the Bad and the Ugly", 20, str2);
   public static Movie movie3 = new Movie("The Lord of the Rings: The Return of the King", 15, str3);

   static void function() {
      Movie[] movies = new Movie[] { movie1, movie2, movie3 };
      Scanner scanner = new Scanner(System.in);
      System.out.println("Choose the movie : ");
      for (int i = 0; i < movies.length; i++) {
         System.out.println((i + 1) + ". " + movies[i].getName());
      }
      movie_id = scanner.nextInt() - 1;
      if ((movie_id + 1 > movies.length) || (movie_id < 0)) {
         System.out.println("Please enter right choice.\n");
         function();
      }

      System.out.println(
            "Choose day :\n1. " + movies[movie_id].getDays()[0] + "\n2. " + movies[movie_id].getDays()[1] + "\n3. "
                  + movies[movie_id].getDays()[2]);
      int day_id = scanner.nextInt();

      System.out.println("Choose hour :\n1. " + "13.00" + "\n2. " + "18.00");
      int hour_id = scanner.nextInt();

      System.out.println("How many tickets do you want to buy?:");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++) {
         System.out.println("Choose seat :" + Arrays.toString(movies[movie_id].getSeats(day_id, hour_id)));
         String seat = scanner.next();
         String x = movies[movie_id].BookTicket(day_id, hour_id, seat);
         Ticket ticket = new Ticket(movies[movie_id].getName(), movies[movie_id].getDays()[day_id - 1],
               movies[movie_id].getHours()[hour_id - 1], x, movies[movie_id].getPrice());
         tickets.add(ticket);
      }

      total = total + n * movies[movie_id].getPrice();
      System.out.println("Tickets ... \n");
      for (int i = 0; i < tickets.size(); i++) {
         tickets.get(i).getTicket();
      }
      System.out.println("Total amount is: " + total + "\nDo you want to buy more tickets? (if yes , type 1,else 0)");
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