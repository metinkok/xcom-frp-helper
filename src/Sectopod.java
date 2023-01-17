public class Sectopod extends Alien{
    String[] abilities = {"Death blossom", "Cannon fire"};
    int width;
    int height;

    Sectopod() {
        super("Sectopod", "images\\Sectopod.webp", 30, 80, 0, 30, 12, 0);
        width = 350; //images dimension of width as pixels
        height = 197; //images dimension of height as pixels
    }
}
