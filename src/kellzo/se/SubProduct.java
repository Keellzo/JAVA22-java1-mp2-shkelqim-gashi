package kellzo.se;

class SubProduct extends Product {

    final double discount;

    SubProduct(String product, int price, int productAmount, double discount) {
        super(product, price, productAmount);

        this.discount = discount;
    }

    //Skapat en ny metod för att hämta priset från superclass och multiplicerar med rabatten
    double getPrice() {
        return super.getPrice() * discount;
    }

    //Här returnar jag enbart discounten för att multiplicera de i printen för sedan att skriva ut rean i procent
    double getDiscount() {
        return discount;
    }
}
