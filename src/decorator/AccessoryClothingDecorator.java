package decorator;

class AccessoryClothingDecorator extends BaseClothingDecorator {
    /*
    * This is a specific (concrete) decorator, for when a clothing item is to be purchased, with let's say, additional accessories.
    * This is getting the object from its parent's class using the super() keyword.
    * - Next, the getPrice() method is present in the same interface that its parent class implements, as well as all the other classes
    * involved in this design pattern. This concrete decorator provides ITS own implementation of that method.
    * */

    public AccessoryClothingDecorator(IClothingItem clothToDecorate) {
        super(clothToDecorate);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }
}
