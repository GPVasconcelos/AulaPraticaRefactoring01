public abstract class Price {
   public abstract int getPriceCode();

   public abstract double getCharge(int daysRented);

   // Versão genérica de pontos de fidelidade
   public int getFrequentRenterPoints(int daysRented) {
      return 1; // Padrão: 1 ponto
   }
}
