public class Cyberdisc extends Alien{
    String[] abilities = {"Death blossom", "Bombard", "Airborne"};

    Cyberdisc() {
        super("Cyberdisc", "images\\Cyberdisc.png", 16, 70, 0, 10, 18, 0, "1d6+3");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 228; //images dimension of height as pixels
    }
}
