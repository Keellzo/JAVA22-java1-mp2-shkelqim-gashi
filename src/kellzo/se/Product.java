package kellzo.se;

class Product {
    private final String product;
    private final double price;
    private int productAmount;


    Product(String product, int price, int productAmount) {
        this.product = product;
        this.price = price;
        this.productAmount = productAmount;
    }

    //Skapat en ny metod för att hämta produktpriset
    //returnerar priset till kunden
    double getPrice() {
        return price;
    }

    //Skapat en ny metod för att hämta produkten från respektive objekt
    // Returnerar sedan produkten till constructorn
    String getProduct() {
        return product;
    }

    //Skapat en ny metod för att hämta antal produkter från respektive objekt
    // Returnerar sedan antal produkter till constructorn
    int getProductAmount() {
        return productAmount;
    }

    //Skapat en metod för att subtrahera från antalet i produkten för respektive objekt
    //Minskar värdet med ett per vald produkt
    void setProductAmount() {
        this.productAmount--;
    }
}