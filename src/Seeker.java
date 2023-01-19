public class Seeker extends Alien{
    String[] abilities = {"Airborne", "Strangle", "Stealth"};

    Seeker() {
        super("Seeker", "images\\Seeker.png", 5, 65, 0, 10, 16, 0);
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 181; //images dimension of height as pixels
    }
}
