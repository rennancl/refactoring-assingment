abstract class Price {
   abstract double getCharge(int daysRented);
   public int getFrequentRenterPoints(int daysRented) {
      return 1;
   }
   abstract int getPriceCode();
}