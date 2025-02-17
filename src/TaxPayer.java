package problema3;


abstract class TaxPayer {
    protected String name;
    protected double annualIncome;

    public TaxPayer(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double calculateTax();

    public String getName() {
        return name;
    }
}