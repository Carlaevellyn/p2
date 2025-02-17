package problema3;

class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double calculateTax() {
        double tax = (annualIncome < 20000.0) ? annualIncome * 0.15 : annualIncome * 0.25;
        tax -= healthExpenditures * 0.50;
        return tax;
    }
}