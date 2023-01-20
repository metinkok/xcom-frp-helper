public class HeavyFloater extends Alien{
    String[] abilities = {"Airborne", "Launch", "Bombard"};

    HeavyFloater() {
        super("Heavy Floater", "images\\Heavy_floater.png", 12, 70, 0, 10, 12, 25,"1d4+4");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 311; //images dimension of height as pixels
    }
}
