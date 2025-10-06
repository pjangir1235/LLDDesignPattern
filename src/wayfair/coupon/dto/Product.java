package wayfair.coupon.dto;

public class Product {
    double price;
    String categoryName;

    public Product(double price, String categoryName) {
        this.price = price;
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
