package factorypattern;

class DrinkFactory {
    private static final int SMALL = 200;
    private static final int MEDIUM = 300;
    private static final int LARGE = 500;

    /*
     * Ignore the specifics of the variables above. This is the warehouse of the drinks, where based on the request
     * from the bar, the instantiation of new objects takes place. This is the actual "factory" element of the class,
     * and can be extended if more concrete types of drinks are introduced.
     *
     * If a new type of drink were to be introduced, let's say "Energy" drinks, then this can easily be modified, and all that
     * the "bar" needs to change, is the @param enteredType.
     *
     * Single Responsibility Principle:
     * -- The code of creation of instances/objects (this FILE), and of functionality (makeDrink, situated in ones own subclass),
     *    are kept separate.
     * */

    public static Drink createDrink(String enteredType) {
        if (enteredType.equals("Alcoholic")) {
            return new Alcoholic(0, SMALL);
        } else if (enteredType.equals("Non-Alcoholic")) {
            return new NonAlcoholic(0, SMALL);
        } /* else if (enteredType.equals("Energy")) {
            ...
        }*/ else {
            return null;
        }
    }
}
