public class Sectoid extends Alien{
    String[] abilities = {"Mind merge", "Supression"};
    int width;
    int height;

    Sectoid() {
        super("Sectoid", "images\\Sectoid.webp", 3, 65, 0, 0, 12, 10);
        width = 350; //images dimension of width as pixels
        height = 197; //images dimension of height as pixels
    }
}