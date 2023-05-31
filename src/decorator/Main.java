package decorator;

/*
* Decorator Pattern: Adding additional features to a base object, by "wrapping" it with decorators. This design pattern is used to extend the base form of a class,
* to add additional features. This folder shows a group of classes, that resemble a scenario of a clothing e-commerce store that sells clothing items. When a user adds
* modifications to his/her order, such as add embroidery options, or add accessories during delivery, that is represented as "decorators", and demonstrated here.
*
* The main() shows the prices of a clothing item changing with added wrappers, before and after.
* */

public class Main {
    public static void main(String[] args) {
        // Initialising a referred object of ClothingItem, to the IClothingItem interface called "tShirt", to which additional features shall be added.
        IClothingItem tShirt = new ClothingItem();

        // This is the price of the tShirt without any added additional features (or wrappers)
        System.out.println(tShirt.getPrice());

        // From the embroideryIncluded to be true first, when the setWrapper method is called, the
        // decorators are actually "applied" on the clothingItem.
        // Here, the original object is "wrapped" with a decorator class, that modifies its functionality.
        IClothingItem modifiedTShirt = new EmbroideryClothingDecorator(tShirt);

        // After the setWrapper method being called (that assigns a decorator to the base item), the
        // price of the tShirt should change, which is the modified functionality that the decorator
        // brings.
        System.out.println(modifiedTShirt.getPrice());
    }
}
