public class Sectopod extends Alien{
    String[] abilities = {"Death blossom", "Cannon fire"};

    Sectopod() {
        super("Sectopod", "images\\Sectopod.png", 30, 80, 0, 30, 12, 0);
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 197; //images dimension of height as pixels
    }
}
