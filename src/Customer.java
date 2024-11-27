import java.util.ArrayList;
import java.util.List;

public class Customer {
   private String _name;
   private List<Rental> _rentals = new ArrayList<>();

   public Customer(String name) {
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.add(arg);
   }

   public String getName() {
      return _name;
   }

   public List<Rental> getRentals() {
      return _rentals;
   }

   public String statement() {
      return new TextStatement().value(this);
   }

   public String htmlStatement() {
      return new HtmlStatement().value(this);
   }

   public double getTotalCharge() {
      return _rentals.stream().mapToDouble(Rental::getCharge).sum();
   }

   public int getTotalFrequentRenterPoints() {
      return _rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
   }
}
