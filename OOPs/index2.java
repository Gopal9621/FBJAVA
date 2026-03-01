
class Product {

    //  Case 1: Selling price after discount
    double sellingPrice(double price, double discountPercent) {
        double discount = price * discountPercent / 100;
        return price - discount;
    }

    // Case 2: Selling price with a fixed 40% discount
    double sellingPrice(double price) {
        double discount = price * 0.40; // 40% discount
        return price - discount;
    }

    //  Case 3: Selling price with discount + exchange bonus
    double sellingPrice(double price, double discountPercent, double exchangeBonus) {
        double discount = price * discountPercent / 100;
        return (price - discount) - exchangeBonus;
    }

    // main method to test
    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("Price after 20% discount: " + p.sellingPrice(1000, 20));
        System.out.println("Price after fixed 40% discount: " + p.sellingPrice(1000));
        System.out.println("Price after 30% discount + ₹200 exchange bonus: " + p.sellingPrice(1000, 30, 200));
    }
}

