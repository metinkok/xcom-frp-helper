public class Sectoid extends Alien{
    String[] abilities = {"Mind merge", "Supression"};

    Sectoid() {
        super("Sectoid", "images\\Sectoid.png", 3, 65, 0, 0, 12, 10, "1d4");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 197; //images dimension of height as pixels
    }
}