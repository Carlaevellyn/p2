package problema1;
import java.util.ArrayList;

class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public String getContents() {
        StringBuilder contents = new StringBuilder("Carrinho do Cliente " + customerID + ":\n");
        for (Product product : productList) {
            contents.append(product.toString()).append("\n");
        }
        return contents.toString();
    }

    public int getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }
}
