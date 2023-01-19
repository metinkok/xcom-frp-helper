public class MutonElite extends Alien{
    String[] abilities = {"Bombard", "Supression"};
    int width;
    int height;

    MutonElite() {
        super("Muton Elite", "images\\Muton_elite.png", 14, 80, 0, 20, 12, 20);
        super.abilities = abilities;
        width = 350; //images dimension of width as pixels
        height = 278; //images dimension of height as pixels
    }
}
