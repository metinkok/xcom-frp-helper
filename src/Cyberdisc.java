public class Cyberdisc extends Alien{
    String[] abilities = {"Death blossom", "Bombard", "Airborne"};
    int width;
    int height;

    Cyberdisc() {
        super("Cyberdisc", "images\\Cyberdisc.webp", 16, 70, 0, 10, 18, 0);
        width = 350; //images dimension of width as pixels
        height = 228; //images dimension of height as pixels
    }
}
