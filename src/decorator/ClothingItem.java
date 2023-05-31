package decorator;

class ClothingItem implements IClothingItem {
    /*
     * The base wrapper, as well as all the child wrappers implements the same interface as the wrapped object.
     * This is the body of the wrapped object, which is a clothing item from an assumed e-commerce store.
     */
    private int price = 20;

    /* Getters - Setters */
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
