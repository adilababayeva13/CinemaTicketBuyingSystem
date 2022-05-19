public class Ticket {
   private String name;
   private String day;
   private String hour;
   private String seat;
   private int price;

   public Ticket(String name, String day, String hour, String seat, int price) {
      this.name = name;
      this.day = day;
      this.hour = hour;
      this.seat = seat;
      this.price = price;
   }

   public void getTicket() {
      System.out.println("-------------------------");
      System.out.println("Movie: " + this.name);
      System.out.println("Date: " + this.day);
      System.out.println("Hour: " + this.hour);
      System.out.println("Seat: " + this.seat);
      System.out.println("Price: " + this.price);
      System.out.println("-------------------------\n");
   }
}
