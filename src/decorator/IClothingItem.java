package decorator;

/* Interface that all objects involved (decorators, objects that get decorated, as well as concrete decorators) follow. */

public interface IClothingItem {
    // A method that is custom-implemented in every wrapper (modified/overridden impl.), AS WELL AS the wrapped object (own initial
    // implementation of the getPrice()), that can be subject to change.
    public int getPrice();
}
