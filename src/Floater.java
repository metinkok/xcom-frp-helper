public class Floater extends Alien{
    String[] abilities = {"Airborne", "Launch"};
    Floater() {
        super("Floater", "images\\Floater.png", 4, 50, 0, 0, 12, 10,"1d4+2");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 263; //images dimension of height as pixels
    }
}
