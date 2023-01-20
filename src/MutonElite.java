public class MutonElite extends Alien{
    String[] abilities = {"Bombard", "Supression"};

    MutonElite() {
        super("Muton Elite", "images\\Muton_elite.png", 14, 80, 0, 20, 12, 20, "1d6+4");
        super.abilities = abilities;
        super.width = 350; //images dimension of width as pixels
        super.height = 278; //images dimension of height as pixels
    }
}
