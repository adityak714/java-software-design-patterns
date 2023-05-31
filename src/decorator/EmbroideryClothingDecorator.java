package decorator;

class EmbroideryClothingDecorator extends BaseClothingDecorator {
    /*
    * This is another concrete decorator, with ITS own functionality that it wraps an object following the interface type IClothingItem, with.
    * */

    /* Getting the object's information from the parent class.  */
    public EmbroideryClothingDecorator(IClothingItem clothToDecorate) {
        super(clothToDecorate);
    }

    /* Below is its custom implementation that this decorator brings, when wrapped to another object. */
    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
