public class Main {
    public void main() {
        double priceOfItem = 108.50;
        final double TAX_RATE = 0.05;
        double totalPrice = 0;

        totalPrice = priceOfItem + (priceOfItem * TAX_RATE);

        System.out.println("Your item costs $" + priceOfItem + ", so, with a tax rate of " + (100 * TAX_RATE) + "%" + ", the total comes out to $" + totalPrice);
    }
}
