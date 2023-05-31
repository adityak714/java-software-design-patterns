package factorypattern;

class NonAlcoholic extends Drink {
    private int cost;
    private int quantity;

    public NonAlcoholic(int cost, int quantity) {
        super();
    }

    /* Variant-specific functionality */
    @Override
    public void makeDrink() {
        System.out.println("Making a mocktail ...");
    }
}
