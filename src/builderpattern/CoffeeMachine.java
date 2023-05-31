package builderpattern;

class CoffeeMachine {
    private int amountCoffee;
    private int amountSugar;
    private int amountWater;
    private int amountMilk;

    public CoffeeMachine() {
        this.amountCoffee = 0;
        this.amountSugar = 0;
        this.amountWater = 0;
        this.amountMilk = 0;
    }
    public int getAmountCoffee() {
        return this.amountCoffee;
    }
    public int getAmountMilk() {
        return this.amountMilk;
    }
    public int getAmountSugar() {
        return this.amountSugar;
    }
    public int getAmountWater() {
        return this.amountWater;
    }

    public CoffeeMachine addCoffee(int amount) {
        this.amountCoffee += amount;
        return this;
    }
    public CoffeeMachine addWater(int amount) {
        this.amountWater += amount;
        return this;
    }
    public CoffeeMachine addSugar(int amount) {
        this.amountSugar += amount;
        return this;
    }
    public CoffeeMachine addMilk(int amount) {
        this.amountMilk += amount;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Coffee: %d, Milk: %d, Sugar: %d, Water: %d", this.amountCoffee, this.amountMilk, this.amountSugar, this.amountWater);
    }
}