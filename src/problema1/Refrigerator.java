package problema1;

class Refrigerator extends Product {
    private int size;

    public Refrigerator(String brand, double price, int size) {
        super(brand, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Geladeira - Marca: " + brand + ", Preço: R$" + price + ", Capacidade: " + size + " litros";
    }
}