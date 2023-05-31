package factorypattern;

class Main {
    public static void main(String[] args) {
        /*
         * This class is the "client" of the Abstract Factory Pattern. that asks to create a new object,
         * without the use of the "new" keyword. It hides all creation of the objects, and returns a different
         * functionality of a common "makeDrink()" method, that varies between multiple types of Drinks.
         *
         * This class, is representing a "bar", which is abstracting the processes of making drinks, and handles
         * only about making requests to create new drinks, and make them.
         * */

        try {
            Drink pepsi = DrinkFactory.createDrink("Non-Alcoholic");
            pepsi.makeDrink();

            Drink cocktail = DrinkFactory.createDrink("Alcoholic");
            cocktail.makeDrink();

            /*  Drink waterGlass = DrinkFactory.createDrink("Water");
                waterGlass.makeDrink();  */

            /* ... */
        } catch (NullPointerException e) {
            System.out.println("There has been an error.");
        }
    }
}
