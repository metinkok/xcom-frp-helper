public class Floater extends Alien{
    String[] abilities = {"Airborne", "Launch"};
    int width;
    int height;

    Floater() {
        super("Floater", "images\\Floater.png", 4, 50, 0, 0, 12, 10);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 263; //images dimension of height as pixels
    }
}
