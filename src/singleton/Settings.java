package singleton;

class Settings {
    int version;
    String model;
    static Settings settings;

    /* Constructor is private, because we do not want to create more than one instance, and only in this class scope, you can call the constructor (see loc. 15) */
    private Settings(int version, String model) {
        this.version = version;
        this.model = model;
    }

    /* The heart of the Singleton pattern: checks whether the settings object is already created, otherwise create one. */
    public static Settings getInstance(int version, String model) {
        if (settings == null)  {
            settings = new Settings(version, model);
        }
        return settings;
    }

    @Override
    public String toString() {
        return String.format("Version: %d, Model: %s", version, model);
    }
}
