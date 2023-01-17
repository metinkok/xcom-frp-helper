public class HeavyFloater extends Alien{
    String[] abilities = {"Airborne", "Launch", "Bombard"};
    int width;
    int height;

    HeavyFloater() {
        super("Heavy Floater", "images\\Heavy_floater.webp", 12, 70, 0, 10, 12, 25);
        width = 350; //images dimension of width as pixels
        height = 311; //images dimension of height as pixels
    }
}