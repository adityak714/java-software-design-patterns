package factorypattern;

abstract class Drink {
    private int cost;
    private int quantity;

    /*
    * The Drink is an abstract class, and can exist in multiple types. REMEMBER: An abstract class is
    * just an interface with attributes, and that can involve inheritance.
    *
    * Hence, apart from basic vars of a drink like cost+quantity (+ getters/setters), a makeDrink() method exists
    * that is overridden from concrete variants of a drink, like Alcoholic, NonAlcoholic, and more. This improves
    * "modifiability" of the program.
    *
    * If another variant, let's say "water" were to be added, only a new subclass should be created, and based on how the factory operates,
    * it will also have a makeDrink() version of itself, and not be tightly coupled necessarily to one or the other
    * already existing types of drinks, but be flexible for additions of more types of drinks.
    * */

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void makeDrink();
}
