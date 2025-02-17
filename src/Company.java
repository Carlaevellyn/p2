package problema3;

class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateTax() {
        return annualIncome * (numberOfEmployees > 10 ? 0.14 : 0.16);
    }
}