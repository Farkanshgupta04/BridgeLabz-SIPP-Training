interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() { return "Books"; }
}

class ClothingCategory implements Category {
    public String getCategoryName() { return "Clothing"; }
}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name; this.price = price; this.category = category;
    }

    public String toString() {
        return name + " [" + category.getCategoryName() + "] ₹" + price;
    }
}

class DiscountManager {
    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }
}