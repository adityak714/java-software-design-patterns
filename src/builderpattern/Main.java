package builderpattern;

class Main {
    public static void main(String[] args) {
        CoffeeMachine nespresso = new CoffeeMachine();
        System.out.println(nespresso);

        nespresso
                .addCoffee(5)
                .addWater(4)
                .addCoffee(5);
        System.out.println(nespresso);
    }
}
