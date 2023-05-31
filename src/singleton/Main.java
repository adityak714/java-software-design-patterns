package singleton;

class Main {
    public static void main(String[] args) {
        // Make first instance of the singleton.Settings class
        Settings mySetting = Settings.getInstance(2, "IOS");
        System.out.println(mySetting);

        // Make a second instance, however it actually won't make it, and just refer back to the very first recorded instance of the class
        Settings mySetting2 = Settings.getInstance(2, "Apple");

        // To show that the second created "object" is basically an alias of the very first object, we compare their hashcodes to find that they are linked to exactly the same object.
        System.out.println(mySetting.hashCode() == mySetting2.hashCode());
    }
}
