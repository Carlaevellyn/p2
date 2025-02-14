package problema1;

public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(101);

        TV tv = new TV("Samsung", 2500.00, 55);
        Refrigerator fridge = new Refrigerator("Brastemp", 3500.00, 400);
        Stove stove = new Stove("Electrolux", 1200.00, 4);

        cart.addProduct(tv);
        cart.addProduct(fridge);
        cart.addProduct(stove);

        System.out.println(cart.getContents());
        System.out.println("Total de itens: " + cart.getItemCount());
        System.out.println("Valor total: R$" + cart.getTotalPrice());

        cart.removeProduct(stove); // Removendo o fogão
        System.out.println("\nApós remover o fogão:");
        System.out.println(cart.getContents());
        System.out.println("Valor total: R$" + cart.getTotalPrice());
    }
}
