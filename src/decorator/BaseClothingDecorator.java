package decorator;

abstract class BaseClothingDecorator implements IClothingItem {
    /* This is made as an abstract class, as the child classes are to choose specific functionality,
    * and a general decorator cannot provide any specific functionality.
    *
    * The decorator object's constructor takes in an object to be wrapped, which is not its original type, but is a reference
    * to the interface it adheres to. This makes it so that multiple concrete decorators can wrap other decorator instances,
    * which in turn, decorate the original ones, the clothing Items.
    *
    * As this is an abstract class, it is expected to have child classes that will be instantiable, instead of this one, and where
    * more precise behaviour will be present, varying from decorator to decorator.
    * */
    private final IClothingItem clothToDecorate;

    public BaseClothingDecorator(IClothingItem clothToDecorate) {
        this.clothToDecorate = clothToDecorate;
    }

    public int getPrice() {
        return this.clothToDecorate.getPrice();
    }
}
