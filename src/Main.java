public class Main {
    public void main() {
        double priceOfItem = 108.50;
        final double taxRate = 0.05;
        double totalPrice = priceOfItem + (priceOfItem * taxRate);

        System.out.println("Your item costs $" + priceOfItem + ", so, with a tax rate of " + (100 * taxRate) + "%" + ", the total comes out to $" + totalPrice);
    }
}
