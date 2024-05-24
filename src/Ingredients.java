public class Ingredients {
    private double amount;
    private String unit;
    private String name;

    public Ingredients(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getName() {
        return this.name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String printIngredients() {
        if (amount == (int) amount) {
            return ((int) amount + " " + unit + " " + name);
        } else {
            return (amount + " " + unit + " " + name);
        }
    }
}
