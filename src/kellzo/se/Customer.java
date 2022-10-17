package kellzo.se;

class Customer {
    private int totalProducts;
    private int totalAmount;

    Customer(int totalProducts, int totalAmount) {
        this.totalProducts = totalProducts;
        this.totalAmount = totalAmount;
    }

    //Metoden hämtar produkterna som kunden valt totalt, när kunden handlat färdigt
    //Returnar produktantalet
    int getTotalProducts() {
        return totalProducts;
    }

    //Metoden sätter produkten för varje val och adderar valet för varje gång kunden väljer produkten
    void setTotalProducts() {
        totalProducts++;
    }

    //Metoden hämtar totala summan till kunden när kunden handlat färdigt
    //Returnar totalsumman
    int getTotalAmount() {
        return totalAmount;
    }

    //Metoden sätter de totala priset för varje vald produkt från kunden
    void setTotalAmount(double price) {
        totalAmount += price;
    }


}