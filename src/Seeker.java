public class Seeker extends Alien{
    String[] abilities = {"Airborne", "Strangle", "Stealth"};
    int width;
    int height;

    Seeker() {
        super("Seeker", "images\\Seeker.webp", 5, 65, 0, 10, 16, 0);
        width = 350; //images dimension of width as pixels
        height = 181; //images dimension of height as pixels
    }
}
