package problema1;

class TV extends Product {
    private int inches;

    public TV(String brand, double price, int inches) {
        super(brand, price);
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    @Override
    public String toString() {
        return "TV - Marca: " + brand + ", Preço: R$" + price + ", Tamanho: " + inches + " polegadas";
    }
}