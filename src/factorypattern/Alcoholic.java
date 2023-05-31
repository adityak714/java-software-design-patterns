package factorypattern;

class Alcoholic extends Drink {
    private int cost;
    private int quantity;

    public Alcoholic(int cost, int quantity) {
        super();
    }

    /* Variant-specific functionality */
    @Override
    public void makeDrink() {
        System.out.println("Making an alcoholic drink....");
    }
}
