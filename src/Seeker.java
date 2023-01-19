public class Seeker extends Alien{
    String[] abilities = {"Airborne", "Strangle", "Stealth"};
    int width;
    int height;

    Seeker() {
        super("Seeker", "images\\Seeker.png", 5, 65, 0, 10, 16, 0);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 181; //images dimension of height as pixels
    }
}
